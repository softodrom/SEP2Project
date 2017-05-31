package program;

public class Department
{
   private int depNumber;
   private String depName;
   private int depCapacity;
   private String depCountry;
   private String depCity;
   private Event[] events;
   private Employee[] employees;
   private int countEmployees;
   private int countEvents;
   private final int DEFAULT_CAPACITY = 100;

   public Department(int depCapacity)
   {
      countEmployees = countEvents = 0;
      employees = (Employee[]) new Object[depCapacity];
      events = (Event[]) new Object[DEFAULT_CAPACITY];

   }

   public int getDepNumber()
   {
      return depNumber;
   }

   public void setDepNumber(int depNumber)
   {
      this.depNumber = depNumber;
   }

   public String getDepName()
   {
      return depName;
   }

   public void setDepName(String depName)
   {
      this.depName = depName;
   }

   public int getDepCapacity()
   {
      return depCapacity;
   }

   public void setDepCapacity(int depCapacity)
   {
      this.depCapacity = depCapacity;
   }

   public String getDepCountry()
   {
      return depCountry;
   }

   public void setDepCountry(String depCountry)
   {
      this.depCountry = depCountry;
   }

   public String getDepCity()
   {
      return depCity;
   }

   public void setDepCity(String depCity)
   {
      this.depCity = depCity;
   }

   public void addEmployee(Employee employee)
   {
      employees[countEmployees] = employee;
      countEmployees++;
   }

   public String removeEmployee(Employee employeeToDelete)
   {
      for (int i = 0; i < countEmployees; i++)
         if (employees[i].getEmployeeID().equals(
               employeeToDelete.getEmployeeID()))
         {
            Employee result = employees[i];
            for (int j = i; j < employees.length - 1; j++)
            {
               employees[j] = employees[j + 1];
            }
            countEmployees--;
            return "Employee " + result.getName()
                  + " is removed from the system";
         }
      return "no such ID in database";
   }

   public void addEvent(Event event)
   {
      events[countEvents] = event;
      countEvents++;
   }

   public String removeEvent(Event eventToRemove)
   {
      for (int i = 0; i < countEvents; i++)
         if (events[i].getName().equals(eventToRemove.getName()))
         {
            Event result = events[i];
            for (int j = i; j < events.length - 1; j++)
            {
               events[j] = events[j + 1];
            }
            countEvents--;
            return "Event " + result.getName() + " is removed from the system";
         }
      return "no such Event in database";
   }

   public String toStringEmployees()
   {
      String s = "";
      for (int i = 0; i < employees.length; i++)
      {
         s = employees[i].getName() + " " + employees[i].getCpr() + "\n" + s;
      }
      return s;
   }

   public String toStringEvents()
   {
      String s = "";
      for (int i = 0; i < employees.length; i++)
      {
         s = events[i].getName() + " " + events[i].getEndDate() + "\n" + s;
      }
      return s;
   }

   public String checkUpcomingEvents(Employee employee)
   {
      String s = "";
      for (int i = 0; i < events.length; i++)
      {
         if (events[i].checkEmployee(employee))
            s = events[i].getName() + "\n" + s;
      }
      return s;
   }
}
