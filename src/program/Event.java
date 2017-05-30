package program;

import statePattern.EventState;
import statePattern.StateConstants;

public class Event implements StateConstants
{
   private String startHour;
   private String endHour;
   private int startDate;
   private int endDate;
   private String startMonth;
   private String endMonth;
   private EventState state = WAITING;
   
   public Event(){
      
   }

   public String getStartHour()
   {
      return startHour;
   }

   public void setStartHour(String startHour)
   {
      this.startHour = startHour;
   }

   public String getEndHour()
   {
      return endHour;
   }

   public void setEndHour(String endHour)
   {
      this.endHour = endHour;
   }

   public int getStartDate()
   {
      return startDate;
   }

   public void setStartDate(int startDate)
   {
      this.startDate = startDate;
   }

   public int getEndDate()
   {
      return endDate;
   }

   public void setEndDate(int endDate)
   {
      this.endDate = endDate;
   }

   public String getStartMonth()
   {
      return startMonth;
   }

   public void setStartMonth(String startMonth)
   {
      this.startMonth = startMonth;
   }

   public String getEndMonth()
   {
      return endMonth;
   }

   public void setEndMonth(String endMonth)
   {
      this.endMonth = endMonth;
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
   
   
}
