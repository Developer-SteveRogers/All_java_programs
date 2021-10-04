import java.util.Scanner;
class Kilometer_to_miles
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value in kilometers");
        float inp = sc.nextFloat();
        float mile = inp*0.621f;
        System.out.println("The value of "+inp+" kilometers in miles is "+mile);
		System.out.println("helli");
	}
}	