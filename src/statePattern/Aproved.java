package statePattern;

import program.Event;

public class Aproved extends EventState
{
   
   @Override
   public void click(Event event)
   {
      event.setState(STARTED);
   }
}
