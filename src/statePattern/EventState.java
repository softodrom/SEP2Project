package statePattern;

import program.Event;

public abstract class EventState implements StateConstants
{
   public abstract void click(Event event);
   
   public void complete(Event event){
      
   }
   
   public String status(){
      String s = getClass().getName();
      return s.substring(s.lastIndexOf('.') + 1);
   }
}
