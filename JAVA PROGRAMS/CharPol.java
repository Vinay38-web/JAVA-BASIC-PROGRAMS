public class CharPol
{
  public static void main(String [] args)
  {
    String str="aba";
	String str1=new StringBuffer(str).reverse().toString();
	if(str1==str)
	{
		System.out.println("The given string is Palindrome");
	}
	else
	{
	    System.out.println("The given string is not a Palindrome");
	}
  }  
}