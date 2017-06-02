package GUI;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

import program.Employee;


public class Controller implements Model
{
   private ObjectOutputStream output;
   private ObjectInputStream input;
   private ArrayList<Object> queue;
   
   public Controller(ArrayList<Object> queue, Socket socket)
   {
      try
      {
         this.queue = queue;
         
         output = new ObjectOutputStream(socket.getOutputStream());
         input = new ObjectInputStream(socket.getInputStream());
      }
      catch (IOException e)
      {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }
   
   public ObjectInputStream getInputStream()
   {
      return input;
   }
   
   public ObjectOutputStream getOutputStream()
   {
      return output;
   }
   
   public synchronized void addInQueue(Object obj)
   {
      queue.add(obj);
      
      notify();
   }

   @Override
   public synchronized boolean existentUser(String userName)
   {
      try
      {
         output.writeObject(new Request(1, userName));
         
         while (queue.size() == 0) {
            
            try
            {
               wait();
            }
            catch (InterruptedException e)
            {
               // TODO Auto-generated catch block
               e.printStackTrace();
            }
            
         }
         
         Boolean bool = (Boolean) queue.get(0);
         
         queue.remove(0);
         
         return bool;
      }
      catch (IOException e)
      {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      
      return false;
   }

   @Override
   public synchronized String getUserPassword(String userName)
   {
      try
      {
         output.writeObject(new Request(2, userName));
         
         while (queue.size() == 0) {
            
            try
            {
               wait();
            }
            catch (InterruptedException e)
            {
               // TODO Auto-generated catch block
               e.printStackTrace();
            }
            
         }
         
         String string = (String) queue.get(0);
         
         queue.remove(0);
         
         return string;
         
      }
      catch (IOException e)
      {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      
      return null;
   }

   @Override
   public synchronized void addEmployee(Employee emp)
   {
      try
      {
         output.writeObject(new Request(3, emp));
      }
      catch (IOException e)
      {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }
   
   public synchronized EmployeeList getEmployeesList()
   {
      try
      {
         output.writeObject(new Request(4, "null"));
         
         while (queue.size() == 0) {
            
            try
            {
               wait();
            }
            catch (InterruptedException e)
            {
               // TODO Auto-generated catch block
               e.printStackTrace();
            }
            
         }
         
         EmployeeList list = (EmployeeList) queue.get(0);
         
         queue.remove(0);
         
         return list;
      }
      catch (IOException e)
      {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      
      return null;
   }
   
}
