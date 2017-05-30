package statePattern;

public interface StateConstants
{
   EventState APROVED = new Aproved();
   EventState CLOSED = new EventIsClosed();
   EventState STARTED = new EventStarted();
   EventState WAITING = new WaitingForAproval();
}
