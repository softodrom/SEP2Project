package program;

public class DepartmentList
{
   private Department[] departments;
   private int count;
   private final static int DEFAULT_CAPACITY = 100;
   
   public DepartmentList(){
      count = 0;
      departments = (Department[]) new Object[DEFAULT_CAPACITY];
   }
   
   public void addDepartment(Department department){
         departments[count] = department;
         count++;
   }
   
   public String removeDepartment(Department department){
         for(int i = 0; i < departments.length; i++)
            if(departments[i].getDepName().equals(department.getDepName())){
               Department result = departments[i];
         for(int j = i; j < departments.length; j++){
            departments[j] = departments[j + 1];
         }
         count--;
         return "Department " + result.getDepName() + " is removed from the system";
            }
         return "no such Department in database";

   }
}
