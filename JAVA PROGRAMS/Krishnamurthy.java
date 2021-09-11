public class Krishnamurthy
{
	public static void main(String[]args)
	{
		int num=145;
		int temp=num;
		int sum=0;
		int remainder=0;
		while(temp!=0)
		{
			remainder=temp%10;
			int fact=1;
			for(int i=1;i<=remainder;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			temp=temp/10;
		}
		if(sum==num)
			System.out.println("Given no is Krishnamurthy no");
		else
			System.out.println("Given no is not a Krishnamurthy no");
	}
}