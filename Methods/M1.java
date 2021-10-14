import java.util.Scanner; 
class Employee{
    int Rollno;
    String name;
    public void printValue(){
        System.out.println("your name is :"+name);
        System.out.println("your id is :"+Rollno);
    }
}
public class M1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        Employee yogi = new Employee();
        Employee tusi = new Employee();
        System.out.println("Enter the first person Roll no.:");
        yogi.Rollno = sc.nextInt(); 
        System.out.println("Enter the first person Name:");
        yogi.name=s.nextLine();
        System.out.println("Enter the Second person Roll no.:");
        tusi.Rollno = sc.nextInt(); 
        System.out.println("Enter the Second person Name:");
        tusi.name=s.nextLine();
        yogi.printValue();
        tusi.printValue();
       
       
        //yogi.name="yogesh";
        //tusi.id=26;
        //tusi.name="tushar";
        //yogi.printValue();
       //tusi.printValue();
    }
    
}