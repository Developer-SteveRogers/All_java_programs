class Factorial
{
	public static void main(String[] args)
	{
		int n = 5;
		int facto = 1;
		for(int i=n;i>1;i--)
		{
			facto = i*facto;
		}
     System.out.print(facto);
	}
}	