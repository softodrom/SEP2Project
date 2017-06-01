package program;

import statePattern.EventState;
import statePattern.StateConstants;

public class Event implements StateConstants
{

   private String name;
   private int startHour;
   private int endHour;
   private int startMinute;
   private int endMinute;
   private int startDate;
   private int endDate;
   private int startMonth;
   private int endMonth;
   private EventState state = WAITING;
   private Employee[] employees;
   private int count;
   private String department;

   private int maxCapacityOfEvent;

   public Event()
   {
      name = "Simple Event";
   }

   public Event(String name)
   {
      this.name = name;
   }
   
   public Event setDepartment(String department)
   {
      this.department=department;
      return this;
   }

   public Event setStartHour(int startHour)
   {
      this.startHour = startHour;
      return this;
   }
   
   public Event setStartMinute(int startMinute)
   {
      this.startMinute = startMinute;
      return this;
   }
   
   public Event setEndHour(int endHour)
   {
      this.endHour=endHour;
      return this;
   }

   public Event setEndMinute(int endMinute)
   {
      this.endMinute = endMinute;
      return this;
   }

   public Event setStartDate(int startDate)
   {
      this.startDate = startDate;
      return this;
   }

   public Event setEndDate(int endDate)
   {
      this.endDate = endDate;
      return this;
   }

   public Event setStartMonth(int startMonth)
   {
      this.startMonth = startMonth;
      return this;
   }

   public Event setEndMonth(int endMonth)
   {
      this.endMonth = endMonth;
      return this;
   }

   public Event build()
   {
      if (maxCapacityOfEvent == 0)
         maxCapacityOfEvent = 100;
      return this;
   }

   public void click()
   {
      state.click(this);
   }

   public void setState(EventState state)
   {
      this.state = state;
   }

   public String status()
   {
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

   public int getStartHour()
   {
      return startHour;
   }

   public int getEndHour()
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

   public int getStartMonth()
   {
      return startMonth;
   }

   public int getEndMonth()
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

   public Boolean checkEmployee(Employee employee)
   {
      for (int i = 0; i < employees.length; i++)
      {
         if (employees[i].getName().equals(employee.getName()))
            return true;
      }
      return false;
   }
   
   
   public String getDepartment()
   {
      return department;
   }

}
