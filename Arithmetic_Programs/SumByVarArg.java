 class SumByVarArg
 {
     static int sum(int ...arr)
	 {
		 int result=0;
		for(int element : arr)
		{
			result += element;
		}
		return result;
		 
	 }
	 public static void main(String[] args)
	 {
		System.out.println(sum(5,7,6));
        System.out.println(sum(5,7,6,9,10));		
}    }