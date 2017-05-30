package statePattern;

import program.Event;

public class EventStarted extends EventState
{

   @Override
   public void click(Event event)
   {
      event.setState(CLOSED);
   }

}
