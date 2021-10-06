public class Matrix
{
	public static void main(String[]args)
	{
		int arr[][]={{1,2,3},{2,4,5}};
		int arr1[][]={{4,5,6},{6,2,8}};
		int arr2[][]=new int[2][3];
		System.out.println("Sum of matrices are:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
			arr2[i][j]=arr[i][j]+arr1[i][j];
			System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}	
		System.out.println("Difference of matrices are:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
			arr2[i][j]=arr[i][j]-arr1[i][j];
			System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Multiplication of matrices are:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
			arr2[i][j]=arr[i][j]*arr1[i][j];
			System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Division of matrices are:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
			arr2[i][j]=arr[i][j]/arr1[i][j];
			System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
	}
}