package program;

import statePattern.EventState;
import statePattern.StateConstants;

public class Event implements StateConstants
{

   private String name;
   private String startHour;
   private String endHour;
   private int startDate;
   private int endDate;
   private String startMonth;
   private String endMonth;
   private EventState state = WAITING;
   
   private int maxCapacityOfEvent;
   
   public Event(){
      name = "Simple Event";
   }
   
   public Event(String name){
      this.name = name;
   }
   
   public Event setStartHour(String startHour){
      this.startHour = startHour;
      return this;
   }
   
   public Event setEndHour(String endHour){
      this.endHour = endHour;
      return this;
   }
   
   public Event setStartDate(int startDate){
      this.startDate = startDate;
      return this;
   }
   
   public Event setEndDate(int endDate){
      this.endDate = endDate;
      return this;
   }
   
   public Event setStartMonth(String startMonth){
      this.startMonth = startMonth;
      return this;
   }
   
   public Event setEndMonth(String endMonth){
      this.endMonth = endMonth;
      return this;
   }
   
   public Event build(){
      if(maxCapacityOfEvent == 0)
         maxCapacityOfEvent = 100;
      return this;
   }
   
   public void click(){
      state.click(this);
   }
   
   public void setState(EventState state){
      this.state = state;
   }
   
   public String status(){
      return state.status();
   }
   
   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public int getMaxCapacityOfEvent()
   {
      return maxCapacityOfEvent;
   }

   public void setMaxCapacityOfEvent(int maxCapacityOfEvent)
   {
      this.maxCapacityOfEvent = maxCapacityOfEvent;
   }

   public String getStartHour()
   {
      return startHour;
   }

   public String getEndHour()
   {
      return endHour;
   }

   public int getStartDate()
   {
      return startDate;
   }

   public int getEndDate()
   {
      return endDate;
   }

   public String getStartMonth()
   {
      return startMonth;
   }

   public String getEndMonth()
   {
      return endMonth;
   }

   public EventState getState()
   {
      return state;
   }
   
   
}
