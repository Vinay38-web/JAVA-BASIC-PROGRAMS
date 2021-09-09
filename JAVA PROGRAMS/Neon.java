public class Neon
{
	public static void main(String[]args)
	{
		int num=9;
		int square=num*num;
		int temp=square;
		int result=0;
		while(temp!=0)
		{
			int remainder=temp%10;
			result=result+remainder;
			temp=temp/10;
		}
		if(result==num)
			System.out.println("The given no is neon");
		else
			System.out.println("The given no is not neon");
	}
}