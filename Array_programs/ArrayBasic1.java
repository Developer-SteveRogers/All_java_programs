import java.util.Scanner;
class ArrayBasic1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the value of rows");
		int r=sc.nextInt();
		System.out.println("Enter the value of colomn");
		int c=sc.nextInt();
		
		int[][] arr=new int[r][c];
		System.out.print("Enter the elements of Array");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			arr[i][j]=sc.nextInt();
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
		}		
			
	}
}	
