import java.util.Scanner;
public class Buzz
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int num=sc.nextInt();;
		int temp=num;
		int remainder=temp%10;
		if(num%7==0)
		{
			System.out.println("Buzz no");
		}
		else if(remainder==7)
		{
			System.out.println("Buzz no");
		}
		else if(num%7==0 || remainder==7)
		{
			System.out.println("The given no is Buzz");
		}
		else{
			System.out.println("not a buzz");
		}
	}
}