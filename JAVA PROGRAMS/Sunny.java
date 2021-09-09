public class Sunny{
	public static void main(String[]args)
	{
		int num=80;
		int ptr;
		ptr=num+1;
		double root=(int)Math.sqrt(ptr);
		double result=root*root;
		if(result==ptr)
		{
			System.out.println("The given number is Sunny number");
		}
		else
		{
			System.out.println("Not a Sunny number");
		}
	}
}
