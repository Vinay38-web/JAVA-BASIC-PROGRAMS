import java.util.Scanner;
public class Atm
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int amount=10;		
        int withdraw=sc.nextInt();	
        while(true)
		{
           System.out.println("Choose 1 for Withdraw");  
           System.out.println("Choose 2 for Deposit");  
           System.out.println("Choose 3 for Check Balance");  
           System.out.println("Choose 4 for EXIT");  
           System.out.print("Choose the operation you want to perform:");
           int choice=sc.nextInt();				
		switch(choice)
		  { 	
	       case 1:
		   if(amount<withdraw)
		     {
			   System.out.println("Insufficient balance");
		     }
		    else
		     {
			  amount=amount-withdraw;
			  System.out.println("Money has been successfully withdrwan");
		     }
		     break;
		    case 2:
		     int deposit=sc.nextInt();
		    System.out.println("Enter the deposit amount");
		    amount=amount+deposit;
		     break;
		     case 3:
		     System.out.println("The total amount is:" + amount);
		     break;
		    case 4:
		     System.exit(0);
	      }
		}
    }
}