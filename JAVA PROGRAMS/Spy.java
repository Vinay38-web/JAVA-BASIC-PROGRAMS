public class Spy
{
	public static void main(String[]args)
	{
		int num=22;
		int result=0;
		int temp=num;
		int result1=1;
		while(temp!=0)
		{
			int remainder=temp%10;
			result=result+remainder;
			result1=result1*remainder;
		    temp=temp/10;
		}
		if(result==result1)
			System.out.println("The given no is Spy");
		else
			System.out.println("The given no is not a spy");
	}
}
			