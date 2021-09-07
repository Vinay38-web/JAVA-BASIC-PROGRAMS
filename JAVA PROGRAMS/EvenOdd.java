public class EvenOdd
{
	public static void main(String[]args)
	{
		int evenCount=0;
		int oddCount=0;
		int num=100;
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				evenCount+=i;
			}
			else
			{
				oddCount+=i;
			}
			}
			System.out.println(evenCount);
			System.out.println(oddCount);
	}
}