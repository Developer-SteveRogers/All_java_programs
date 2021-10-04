import java.util.Scanner;
class SumOfNaturalNumbers
{
  public static void main(String[] args)
  {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Write how many number's sum do you wants to print:");
	  int x= sc.nextInt();
	  sum(x);
  }
	  static void sum(int x)
	  {
		  int yog=0;
	  for(int i=1;i<=x;i++)
	  {
		  yog=yog+i;
	  }
	  System.out.println(yog);
		  
	  }
  
}		  