import java.util.Scanner;
class LeepYear
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Year");
        int input = sc.nextInt();
        if(input%4==0)
           System.out.println("your year is leap year");
        else
		 System.out.println("your year is not leap year");
	}
}	