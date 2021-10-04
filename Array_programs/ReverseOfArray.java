
class ReverseOfArray
{
	public static void main(String[] args)
	{
		int temp;
		int[] arr={1,2,3,4,5,6,7};
		int l = arr.length;
		int n = Math.floorDiv(1,2);
		for(int i=0;i<n;i++)
		{
			temp=arr[i];
		    arr[i]=arr[l-i-1];
			arr[l-i-1]=temp;
		}
		for(int element : arr)
		{
		System.out.println(element+" ");
		}
   }
}
			
	