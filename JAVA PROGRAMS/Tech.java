public class Tech 
{  
public static void main(String args[])  
{  
int  firstHalf, secondHalf, digits = 0, squareOfSum = 0;  
int num=2025;  
int temp=num;
while (temp > 0)  
{        
digits++;    
num = num / 10;  
}   
if (digits % 2 == 0)  
{  
temp = num;   
firstHalf = temp % (int) Math.pow(10, digits / 2);   
secondHalf = temp / (int) Math.pow(10, digits / 2);  
squareOfSum = (firstHalf + secondHalf) * (firstHalf + secondHalf);  
//compares the square of the sum with the given number  
if (num == squareOfSum)  
{  
System.out.println(num+" is a tech number.");  
}  
else  
{  
System.out.println(num+" is not a tech number.");  
}  
}  
else  
{  
System.out.println(num+ " is not a tech number.");  
}  
}  
}  
