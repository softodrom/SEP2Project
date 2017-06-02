package GUI;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class ClientMain
{
   public static void main(String[] args)
   {
      try
      {
         Socket socket = new Socket("localhost", 9090);
         
         ArrayList<Object> queue = new ArrayList<Object>();
         
         Controller controller = new Controller(queue, socket);
         
         Thread thread = new Thread(new ClientReceiver(controller));
         
         thread.start();

         new SignIn(controller);
      }
      catch (UnknownHostException e)
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
