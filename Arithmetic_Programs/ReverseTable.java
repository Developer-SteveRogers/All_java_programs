class ReverseTable
{
	public static void main(String[] args)
	{ 
	    int n = 10;
		int multi = 1;
		for(int i=10;i>=1;i--)
		{
			multi = n*i;
			System.out.printf("%d X %d = %d\n",n,i,multi);
		}
	}
}
			
			