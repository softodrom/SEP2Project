package statePattern;

import program.Event;

public class WaitingForAproval extends EventState
{
   
   @Override
   public void click(Event event)
   {
      event.setState(APROVED);
   }
}
