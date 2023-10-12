// Write a Java Program to ATM program 
import java.util.Scanner;
public class ATMMachine
{
	public static void main(String args[])
	{
		int balance=100000,withdraw,deposit;
		Scanner in=new Scanner(System.in);
		while(true)
		{
			System.out.println("Automated Teller Machine");
			System.out.println("Choose 1 for Withdraw ");
			System.out.println("Choose 2 for Deposit ");
			System.out.println("Choose 3 for Check Balance ");
			System.out.println("Choose 4 for EXIT");
			System.out.print("Choose the operation you want to perform : ");
			int choice=in.nextInt();
			switch(choice)
			{
				case 1:
					System.out.print("Enter amount [Rs.] : ");
					withdraw=in.nextInt();
					if(balance>=withdraw)
					{
						balance-=withdraw;
						System.out.println("Please collect your money . ");
					}
					else
					{
						System.out.println("Insufficient Balance . ");
					}
					System.out.println();
				break;
				case 2:
					System.out.print("Enter amount [Rs.] : ");
					deposit=in.nextInt();
					balance+=deposit;
					System.out.println("Deposit successful . ");
					System.out.println();
				break;
				case 3:
					System.out.println("Balance : "+balance);
					System.out.println();
				break;
				case 4:
					System.exit(0);
				break;
				default:
					System.out.println("Invalid choice . No such option .");
					System.out.println();
				
			}
		}
	}
}