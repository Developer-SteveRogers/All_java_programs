import java.util.Scanner;
class Pattern3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Eneter the number of rows");
		int x = sc.nextInt();
		Pattern(x);
	}
	static void Pattern(int x)
		{
		 for(int i=0;i<x;i++)
		   {
			   for(int j=0;j<i;j++)
			   {
				   System.out.print("*");
			   }
			   System.out.println();
		   }
		}
}