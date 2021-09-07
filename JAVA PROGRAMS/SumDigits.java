public class SumDigits
{
	public static void main(String[] args)
	{
		int remainder=0;
		int result=0;
		int num=454;
		int temp=num;
		while(temp!=0)
		{
			remainder=temp%10;
			result=result+remainder;
			temp=temp/10;
		}
		System.out.println(result);
	}
}
