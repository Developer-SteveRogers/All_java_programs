class MaxInArray
{
  public static void main(String[] args)
  {
	  int arr[] ={3,56,5,65,89,6,2,53,63};
	  int min=100;
      for(int element : arr)
	  {
        if(element<min)
		{
        min = element;			
		}
	  }
	  System.out.println("the lowest element is"+min);
  }
}