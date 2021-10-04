import java.util.Scanner;
class PassFail
{   
    public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    System.out.print("  Please Enter your marks in physics:");
		int m1 = sc.nextInt();
		System.out.print("  Please Enter your marks in Chemistry:");
		int m2 = sc.nextInt();
		System.out.print("  Please Enter your marks in Maths:");
		int m3 = sc.nextInt();
		float avg = (m1 + m2 + m3)/3.0f;
		System.out.println("avg"+avg);
		if(m1>=33 && m2>=33 && m3>=33 && avg > 40 )
			System.out.println(" you are pass");
		else 
			System.out.println("you are fail");
	}
}