import java.util.Scanner;
public class Scan
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Enter a no:" + num);
		for(int i=1;i<=num;i++)
		{
			System.out.println(i);
		}
	}
}
