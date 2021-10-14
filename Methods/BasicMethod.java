import java.util.Scanner;
class BasicMethod{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        getSalary(x);
        getName(name);
        setName(change);

    }
}
 public class Employee{
     int salary;
     String name;
     Employee yogi = new Employee();
     public int getSalary(int sal){
         System.out.println("Enter the salary:");
         int Sal=sc.nextInt();
         System.out.println("Your salary is :"+sal);
       }
     public void getName(String name){
         System.out.println("Enter your name:");
         String name = sc.nextLine();
         System.out.println("your name is :"+name);
     }
     public void setName(String change){
         System.out.println("Enter the changing name:");
         String change= sc.nextLine();
         System.out.println("Your changed name is:"+change);
     }
 }