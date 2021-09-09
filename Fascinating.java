public class Fascinating
{
	public static void main(String[]args)
	{
		int num=354;
		int twice=num*2;
		int thrice=num*3;
		String s=String.valueOf(num);  
		String s1=String.valueOf(twice);
        String s2=String.valueOf(thrice);  		
		String str=s+s1+s2;
		boolean found = true;  
		for(char c = '1'; c <= '9'; c++)  
		{  
	        int count = 0; 
			for(int i = 0; i < str.length(); i++)  
			{  
		        char ch = str.charAt(i);  
				if(ch == c)  
					count++;  
		    }  
				if(count > 1 || count == 0)  
				{  
			       found = false;  
				   break;  
				}  
		}  
				   if(found)  
					   System.out.println(num + " is a fascinating number.");  
				   else  
					   System.out.println(num + " is not a fascinating number.");    
	}
}
		