package GUI;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.print.attribute.standard.RequestingUserName;

import program.Employee;


public class ServerCommunication implements Runnable
{
   private ObjectInputStream input;
   private ObjectOutputStream output;
   private ServerModelManager model;
   
   public ServerCommunication(Socket socket, ServerModelManager model)
   {
      try
      {
         input = new ObjectInputStream(socket.getInputStream());
         output = new ObjectOutputStream(socket.getOutputStream());
         
         this.model = model;
      }
      catch (IOException e)
      {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }

   @Override
   public void run()
   {
      while (true) {
         
         try
         {
            Request request = (Request) input.readObject();
            
            if (request.getCode() == 1) output.writeObject(model.existentUser((String)request.getObject())); else
               if (request.getCode() == 2) output.writeObject(model.getUserPassword((String)request.getObject())); else
               if (request.getCode() == 3) model.addEmployee((Employee)request.getObject()); else
                  if (request.getCode() == 4) output.writeObject(model.getEmployeesList());
         }
         catch (ClassNotFoundException e)
         {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
         catch (IOException e)
         {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
         
      }
   }

}
