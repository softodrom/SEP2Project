package GUI;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerConnection implements Runnable
{
   private ServerSocket welcomeSocket;
   private ServerModelManager model;
   
   public ServerConnection(ServerModelManager model)
   {
      this.model = model;
   }
   
   public void run()
   {
      try
      {
         welcomeSocket = new ServerSocket(9090);
      }
      catch (IOException e)
      {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      
      while (true) {
         
         System.out.println("Server waits for clients...");
         
         try
         {
            Socket socket = welcomeSocket.accept();
            
            Thread thread = new Thread(new ServerCommunication(socket, model));
            
            thread.start();
         }
         catch (IOException e)
         {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
         
      }
   }
}
