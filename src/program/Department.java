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
   
   public Department(){
      
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
   
   
}
