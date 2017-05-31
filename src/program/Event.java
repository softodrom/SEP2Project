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
   private Employee[] employees;
   private int count;
   
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
   
   public void addEmployee(Employee employee)
   {
      employees[count] = employee;
      count++;
   }
   
   public String removeEmployee(Employee employeeToDelete)
   {
      for (int i = 0; i < count; i++)
         if (employees[i].getEmployeeID().equals(
               employeeToDelete.getEmployeeID()))
         {
            Employee result = employees[i];
            for (int j = i; j < employees.length - 1; j++)
            {
               employees[j] = employees[j + 1];
            }
            count--;
            return "Employee " + result.getName()
                  + " is removed from the system";
         }
      return "no such ID in database";
   }
   
   public Boolean checkEmployee(Employee employee){
      for(int i = 0; i < employees.length; i++){
         if(employees[i].getName().equals(employee.getName()))
            return true;
      }
      return false;
   }
   
   
}
