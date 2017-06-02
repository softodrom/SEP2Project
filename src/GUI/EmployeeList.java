package GUI;

import java.io.Serializable;
import java.util.ArrayList;

import program.Employee;

public class EmployeeList implements Serializable
{
   private ArrayList<Employee> employees;
   
   public EmployeeList()
   {
      employees = new ArrayList<Employee>();
   }
   
   public void addEmployee(Employee emp)
   {
      employees.add(emp);
   }
   
   public Employee getEmployee(int index)
   {
      return employees.get(index);
   }
   
   public int getSize()
   {
      return employees.size();
   }
}
