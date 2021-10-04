import java.util.Scanner;
class ComplexPattern.java
{
	public static void main(String[] args)
	{
		//Scanner sc = new Scanner(System.in);
		//System.out.print("please Enter the number");
		//int A=sc.nextInt();
		for(int i=0;i<=30;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			int c=30*2;
			while(c!=i*2-1)
			{
				System.out.print("*");
				c--;
			}
			System.out.print("\n");
		}
	}
}