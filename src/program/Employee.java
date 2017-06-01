package program;

import java.io.Serializable;

public class Employee implements Serializable
{
   private String name;
   private String cpr;
   private String password;
   private int birthYear;
   private int birthDate;
   private int birthMonth;
   private String employeeID;
   private String userName;
   private String email;
   private String role;
   private int wages;
   private String department;
   
   public Employee(){
      
   }

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public String getCpr()
   {
      return cpr;
   }

   public void setCpr(String cpr)
   {
      this.cpr = cpr;
   }
   
   public void setPassword(String password)
   {
      this.password = password;
   }
   
   public String getPassword()
   {
      return password;
   }

   public int getBirthYear()
   {
      return birthYear;
   }

   public void setBirthYear(int birthYear)
   {
      this.birthYear = birthYear;
   }

   public int getBirthDate()
   {
      return birthDate;
   }

   public void setBirthDate(int birthDate)
   {
      this.birthDate = birthDate;
   }

   public int getBirthMonth()
   {
      return birthMonth;
   }

   public void setBirthMonth(int birthMonth)
   {
      this.birthMonth = birthMonth;
   }

   public String getEmployeeID()
   {
      return employeeID;
   }

   public void setEmployeeID(String employeeID)
   {
      this.employeeID = employeeID;
   }

   public String getUserName()
   {
      return userName;
   }

   public void setUserName(String userName)
   {
      this.userName = userName;
   }

   public String getEmail()
   {
      return email;
   }

   public void setEmail(String email)
   {
      this.email = email;
   }

   public String getRole()
   {
      return role;
   }

   public void setRole(String role)
   {
      this.role = role;
   }

   public int getWages()
   {
      return wages;
   }

   public void setWages(int wages)
   {
      this.wages = wages;
   }
   
   public void setDepartment(String department)
   {
      this.department=department;
   }
   
   public String getDepartment()
   {
      return department;
   }
   
}
