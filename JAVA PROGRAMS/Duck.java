public class Duck
{
	public static void main(String[]args)
	{
		int num=1210;
		int remainder=num%10;
		if(remainder==0)
		{
		   System.out.println("the given no is duck");
		}
		int temp=num;
		int firstDigit=0;
		while(temp!=0)
		{
			firstDigit=temp%10;
			temp=temp/10;
		}
		System.out.println(firstDigit);
		if(firstDigit==0)
			System.out.println("The given no is not a Duck");
		else
			System.out.println("The given no is Duck");
	}
}
