class constructor{
    //int a,b;
     constructor(int a,int b){
     System.out.println(a+b);
     }
      constructor(int c,int d,int f){
         System.out.println(c*d*f);
     }
     constructor(int g, int h,int i, int j){
         System.out.println(g*h*i*j);
     }

}
public class M5{
    public static void main(String [] args){
         constructor a = new constructor(5,6);
         constructor b= new constructor(10,20,30);
         constructor c= new constructor(50,10,10,20);
      
    
    
    }
}