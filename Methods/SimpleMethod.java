class SimpleMethod
{
 public static void multi(int n)
	{   
	 	  for(int i=1;i<=10;i++)
		{
			System.out.printf("%d X %d = %d\n",n,i,n*i);
		}	
	}
	public static void main(String[] args)
	{
		 multi(5);
         multi(10);
         multi(50);		 
	}
}
	