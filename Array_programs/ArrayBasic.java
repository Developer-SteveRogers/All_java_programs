import java.util.Scanner;
class ArrayBasic
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the size of Array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Please Enter the Elements of Array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int element:arr)
		{
			System.out.println("the elements of array is"+element);
		}
	}
}