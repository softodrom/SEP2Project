package GUI;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class ClientReceiver implements Runnable
{
   private Controller controller;
   private ObjectInputStream input;
   
   public ClientReceiver(Controller controller)
   {
      this.controller = controller;
      this.input = controller.getInputStream();
   }

   @Override
   public void run()
   {
      while (true) {
         
         try
         {
            Object obj = input.readObject();
            
            controller.addInQueue(obj);
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
