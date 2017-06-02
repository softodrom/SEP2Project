package GUI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import program.Employee;

public class ServerModelManager implements Model
{
   private Connection conn;
   
   public ServerModelManager()
   {
      System.out.println("Server started");
      
      try
      {
         Class.forName("org.postgres.Driver");
         
         conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "4016");
         
         conn.setSchema("courseassign");
         
         Thread thread = new Thread(new ServerConnection(this));
         
         thread.start();
      }
      catch (ClassNotFoundException e)
      {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      catch (SQLException e)
      {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }
   
   public static String reverse(String s)
   {
      return s.charAt(7) + "" + s.charAt(8) + "" + s.charAt(9) + s.charAt(10) + "-" + s.charAt(3) + s.charAt(4) + "-" + s.charAt(0) + s.charAt(1);  
   }
   
   public boolean existentUser(String userName)
   {
      try
      {
         PreparedStatement stmt = conn.prepareStatement("SELECT * FROM users WHERE username = ?");
         
         stmt.setString(1, userName);
         
         ResultSet rS = stmt.executeQuery();
         
         return rS.next();
      }
      catch (SQLException e)
      {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      return false;
   }
   
   public String getUserPassword(String userName)
   {
      try
      {
         PreparedStatement stmt = conn.prepareStatement("SELECT password FROM users WHERE username = ?");
         
         stmt.setString(1, userName);
         
         ResultSet rS = stmt.executeQuery();
         
         rS.next();
         
         return rS.getString(1);
      }
      catch (SQLException e)
      {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      
      return null;
   }
   
   public void addEmployee(Employee emp)
   {
      try
      {
         PreparedStatement stmt = conn.prepareStatement("INSERT INTO users (username, password, role, name, birthday, email, department, wages) VALUES (?, ?, ?, ?, ?::date, ?, ?, ?)");
         
         stmt.setString(1, emp.getUserName());
         stmt.setString(2, emp.getPassword());
         stmt.setString(3, emp.getRole());
         stmt.setString(4, emp.getName());
         stmt.setString(5, emp.getBirthYear() + "-" + emp.getBirthMonth() + "-" + emp.getBirthDate());
         stmt.setString(6, emp.getEmail());
         stmt.setString(7, emp.getDepartment());
         stmt.setInt(8, emp.getWages());
         
         stmt.executeUpdate();
      }
      catch (SQLException e)
      {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }
   
   public EmployeeList getEmployeesList()
   {
      try
      {
         EmployeeList list = new EmployeeList();
         
         PreparedStatement stmt = conn.prepareStatement("SELECT * FROM users");
         
         ResultSet rS = stmt.executeQuery();
         
         while (rS.next()) {
          
            Employee employee = new Employee();
            
            System.out.println(rS.getString(5));
            
            employee.setCpr(rS.getString(1));
            employee.setUserName(rS.getString(2));
            employee.setPassword(rS.getString(3));
            employee.setRole(rS.getString(4));
            employee.setName(rS.getString(5));
            employee.setBirthDate((rS.getString(6).charAt(8) - 48) * 10 + rS.getString(6).charAt(9) - 48);
            employee.setBirthMonth((rS.getString(6).charAt(5) - 48) * 10 + rS.getString(6).charAt(6) - 48);
            employee.setBirthYear((rS.getString(6).charAt(0) - 48) * 1000 + (rS.getString(6).charAt(1) - 48) * 100 + (rS.getString(6).charAt(2) - 48) * 10 + rS.getString(6).charAt(3) - 48);
            employee.setEmail(rS.getString(7));
            employee.setDepartment(rS.getString(8));
            employee.setWages(rS.getInt(9));
            
            list.addEmployee(employee);
         
         }
         
         return list;
      }
      catch (SQLException e)
      {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      
      return new EmployeeList();
   }
}
