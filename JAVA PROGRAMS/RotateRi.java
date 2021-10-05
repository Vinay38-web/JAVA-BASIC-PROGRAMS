public class RotateRi
{
	public static void main(String[]args){
		int arr[]={1,2,3,4,5};
		for(int x:arr)
		{
			System.out.print(x + " ");
		}
		int n=2;
		for(int i=0;i<n;i++)
		{
			int j,last;
			last=arr[arr.length-1];
			for(j=arr.length-1;j>0;j--)
			{
				arr[j]=arr[j-1];
			}
			arr[0]=last;
		}
		for(int y:arr)
			System.out.print(y + " ");
	}
}
