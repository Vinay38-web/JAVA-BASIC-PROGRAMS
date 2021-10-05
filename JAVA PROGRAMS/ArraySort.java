public class ArraySort
{
	public static void main(String []args)
	{
		int arr[]={1,2,30,40,0,3};
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		System.out.println(arr[i]);
		}
	}
}