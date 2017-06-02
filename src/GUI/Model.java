package GUI;

import program.Employee;

public interface Model
{
   public boolean existentUser(String userName);
   public String getUserPassword(String userName);
   public void addEmployee(Employee emp);
   public EmployeeList getEmployeesList();
}
