public class Employee{
   private String name;
   private int id;
   private double salary;

   public void setName(String name){
     this.name = name;
   }
   public void setId(int id){
     this.id = id;
   }
   public void setSalary(double salary){
     this.salary = salary;
   }

   public String getName(){
    return name;
   }
   public int getId(){
    return id;
   }
   public double getSalary(){
     return salary;
   }
   public String toString(){
     return "Name : " + name + "\nId : " + id + "\nSalary : " + salary;
   }
   public boolean equals(Object o){
     if(o instanceof Employee){
       Employee o1 = (Employee)o;
       return o1.name.equals(name) && o1.id == id && o1.salary == salary;
     }
     return false;
   }
  public int hashCode(){
    return id;
  }
}
