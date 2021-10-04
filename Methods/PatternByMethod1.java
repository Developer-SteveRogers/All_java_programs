import java.util.Scanner;
class PatternByMethod1
{
   public static void Pattern(int n)
   {
	   for(int i=n;i>=1;i--)
       {
		   for(int j=i;j>=1;j--)
		   {
			   System.out.print("*");
		   }
		   System.out.println();
	   }
   }
      public static void main(String[] args)
	  {
		  Scanner sc= new Scanner(System.in);
		  System.out.println("Enter the number of lines you want to print:");
		  int a= sc.nextInt();
		  Pattern(a);
	  }
}