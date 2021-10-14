import java.util.Scanner;
class BasicMethod{
    public static void main(String[] args){
      Employee yogi = new Employee();
      yogi.setName("yogesup");
      yogi.Salary=80000;
      System.out.println(yogi.getName());
      System.out.println(yogi.getSalaray());
    }
}
 public class Employee{
     int salary;
     String name;
     
     public int getSalary(){
         return salary;
       }
     public String getName(){
         return name;
     }
     public void setName(String s){
         name = s;
     }
 }