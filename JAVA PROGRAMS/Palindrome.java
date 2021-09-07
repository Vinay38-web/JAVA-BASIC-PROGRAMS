public class Palindrome
{
  public static void main(String [] args)
    {
	  int remainder;
	  int result=0;
	  int num=454;
	  int temp=num;
	  while(temp!=0)
	    {
		   remainder=temp%10;
		   result=(result*10)+remainder;
		   temp=temp/10;
		}
	   if(result==num)
	   {
	    System.out.println("The given no is a Palindrome");
	   }
	   else
	   {
	    System.out.println("the given no is not a Palindrome");
		}
	}
}