package GUI;

import java.io.Serializable;

public class Request implements Serializable
{
   private int code;
   private Object obj;
   
   public Request(int code, Object obj)
   {
      this.code = code;
      this.obj = obj;
   }
   
   public int getCode()
   {
      return code;
   }
   
   public Object getObject()
   {
      return obj;
   }
}
