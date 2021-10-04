class AddingArray
{
	public static void main(String[] args)
	{
		int[][] arr ={{1,1},{1,1}};
		int[][] arr1 ={{1,1},{1,1}};
		int[][] result ={{0,0},{0,0}};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				result[i][j]=arr[i][j]+arr1[i][j];
			}
			
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(result[i][j]);
			}
			System.out.println();
			
		}
	}
}