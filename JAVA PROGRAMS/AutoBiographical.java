import java.util.Scanner;
public class AutoBiographical
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		int result=0;
		int temp=num;
		while(temp!=0)
		{
			int remainder=temp%10;
			result=result+remainder;
			temp=temp/10;
			count++;
		}
		if(result==count)
			System.out.println("The given number is an AutoBiographical number");
		else
			System.out.println("The given number is not an AutoBiographical number");
	}
}

		