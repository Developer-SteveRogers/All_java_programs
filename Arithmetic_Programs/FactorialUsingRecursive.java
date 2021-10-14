import java.util.Scanner;
class FactorialUsingRecursive
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int x = sc.nextInt();
        System.out.println(fact(x));
    }
    static int fact(int x)
{
        if(x==1)
        {
            return(x);
        }
        else
        {
            return(x*fact(x-1));
        }
    } 
}