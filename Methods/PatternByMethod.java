import java.util.Scanner;
class PatternByMethod
{
   public static void Pattern(int n)
   {
	   for(int i=0;i<n;i++)
       {
		   for(int j=0;j<=i;j++)
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