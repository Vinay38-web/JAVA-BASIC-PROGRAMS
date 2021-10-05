import java.util.*;
public class CopyArray
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the elements:");
		int size=sc.nextInt();
		int []arr= new int[size];
		int []arr2=arr;
		System.out.println("Enter the elements in array 1:");
		for(int j=0;j<arr.length;j++)
		{	
	      arr[j]=sc.nextInt();
		}
		System.out.println("Array2 elements are:");
		for(int x:arr)
			System.out.print(x + " ");
	}
}