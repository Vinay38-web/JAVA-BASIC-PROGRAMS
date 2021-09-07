public class Fibonacci
{
	public static void main(String[]args)
	{
		int currentTerm=1;
		int previousTerm=0;
		int nextTerm;
		for(int i=0;i<10;i++)
		{
			System.out.println(previousTerm);
			nextTerm=currentTerm+previousTerm;
			previousTerm=currentTerm;
			currentTerm=nextTerm;
		}
	}
}
