public class Factorial
{
	public static void main(String[]args)
	{
		int fact=1;
		int num=5;
		if(num==0)
		{
			System.out.println("Please enter a positive number");
		}
		if(num<0)
		{
			System.out.println("Please enter a positive number");
		}
		else
		{
			System.out.println("Given number is a positive number");
		}
		for(int i=1;i<=5;i++)
		{
			fact=fact*i;
		}
		System.out.println("The factorial of the given number is:"+ fact);
	}
}

		
		