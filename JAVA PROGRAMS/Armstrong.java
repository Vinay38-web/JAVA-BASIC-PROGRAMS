public class Armstrong
{
	public static void main(String[]args)
	{
		int remainder;
		int result=0;
		int num=371;
		int temp=num;
		while(temp!=0)
		{
			remainder=temp%10;
			result+=Math.pow(remainder,3);
			temp=temp/10;
		}
		if(result==num)
			System.out.println("The given no is armstrong no");
		else
			System.out.println("The given no is not a palindrome");
	}
}