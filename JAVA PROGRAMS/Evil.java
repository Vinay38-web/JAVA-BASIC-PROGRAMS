public class Evil
{
	public static void main(String[]args)
	{
		int num=23;
		String binary=Integer.toBinaryString(num);
		int i=Integer.parseInt(binary); 
		int remainder=0;
		int result=0;
		int temp=i;
		while(temp!=0)
		{
			remainder=temp%10;
			result=result+remainder;
			temp=temp/10;
		}
		if(result%2==0)
		{
			System.out.println("The given no is Evil");
		}
		else
		{
			System.out.println("The given no is odious");
		}
	}
}
