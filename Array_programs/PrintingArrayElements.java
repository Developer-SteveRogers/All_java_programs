import java.util.Scanner;
class PrintingArrayElements
{
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements you want to add in array");
		int n = sc.nextInt();
		int[] input = new int[n];
		
		System.out.println("Enter the Array Elements");
		for(int i=0;i<input.length;i++)
		{
			input[i]=sc.nextInt();
		}
		System.out.println("the array elements are:");
		for(int element : input)
		{
			System.out.println(element);
		}			
	}
}