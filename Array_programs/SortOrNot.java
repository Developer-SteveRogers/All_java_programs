class SortOrNot
{
	public static void main(String[] args)
	{
		int[] arr={1,2,3,52,61,1};
		boolean isSort=true;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
				isSort = false;
		}
		if(isSort)
		System.out.println("Array is sort :");
        else
		System.out.println("Array is not sort");
	}
}