import java.util.*;
public class PalindromeWord
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		str=str.toLowerCase();
		int count=0;
		char ch[]=new char[str.length()];
		for(int i=0;i<str.length();i++)
		{
			ch[i]=str.charAt(i);
			if(((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' '))|| ((ch[0]!=' ')&&(i==0)))
			{
				count++;
			}
		}
		System.out.println(str);
		String[] s1=str.split(" ",count);
		int count1=0;
		for(String a:s1)
		{
			String b=new StringBuffer(a).reverse().toString();
			if(a.equals(b))
			{
				count1++;
				System.out.println("Palindrome word is:" + a);
			}
			else
			{
				System.out.println("Not a palindrome word is:" + a);
			}
		}
		System.out.println("No of Palindrome words are:" + count1);
	}
}
			