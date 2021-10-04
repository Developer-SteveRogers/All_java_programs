import java.util.Scanner;
class CBSE
{
public static void main(String[] args)
{
	int input1 , input2 , input3 , input4 , input5 , sum;
	float Per,div;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the marks in English :");
	input1 = sc.nextInt();
	System.out.println("Enter the marks in Hindi :");
	input2 = sc.nextInt();
	System.out.println("Enter the marks in maths :");
	input3 = sc.nextInt();
	System.out.println("Enter the marks in sanskrit :");
	input4 = sc.nextInt();
	System.out.println("Enter the marks in SST :");
	input5 = sc.nextInt();
    sum = input1 + input2 + input3 + input4 + input5 ;
	Per = (sum*100)/500;
	System.out.println("your sum is :" +sum);


	System.out.println("your percentage is :" +Per);

}
}