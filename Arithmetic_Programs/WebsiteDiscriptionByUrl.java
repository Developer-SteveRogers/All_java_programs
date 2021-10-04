import java.util.Scanner;
class WebsiteDiscriptionByUrlṇ
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your site URL:");
        String str = sc.nextLine();
        if(str.endsWith(".com"))
		    System.out.println("this is a commericial website");
        else if(str.endsWith(".org"))
            System.out.println("this is a organization website");
        else if (str.endsWith(".in"))
            System.out.println("this is a indain website");
		else 
			System.out.println("Please eneter valid input");
	}
}	