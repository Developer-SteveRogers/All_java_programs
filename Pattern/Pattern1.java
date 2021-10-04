import java.util.Scanner;
class Pattern1
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number:");
	int A = sc.nextInt();
	for(int i=1;i<=A;i++)
	{
		if(i%2==0)
		{
			for(int j=1;j<=5;j++)
		    System.out.print(j+"#");
		}
		else
		{
			for(int j=1;j<=5;j++)
		System.out.print(j+"?");	
		}
		 System.out.print("\n");
	 
	}	
}   
}	