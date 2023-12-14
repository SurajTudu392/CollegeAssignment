/*
1.	Write a Java program to create Bank is a class that provides a method to get the rate of interest.
However, the rate of interest may differ according to banks.
For example, SBI, ICICI, and AXIS banks are providing 8.4%, 7.3%, and 9.7% rate of interest.
*/
import java.util.*;
import java.io.*;
public class Banking
{
	public static void main(String args[])throws IOException
	{
		String bankname;
		double principle,time,rateofinterest,amount,interest;
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter Principle : ");
		principle=in.nextDouble();
		
		System.out.print("Enter Time [Year] : ");
		time=in.nextDouble();
		
		System.out.print("Enter Bank Name : ");
		bankname=(new BufferedReader(new InputStreamReader(System.in))).readLine();
		
		Bank bank=null;
		switch(bankname.toUpperCase())
		{
			case "SBI":
			bank=new SBI();
			break;
			case "ICICI":
			bank=new ICICI();
			break;
			case "AXIS":
			bank=new AXIS();
			break;
			default:
			System.out.println("Invalid Bank Name . ");
			System.exit(0);
		}
		rateofinterest=bank.getRateOfInterest();
		interest=principle*time*rateofinterest/100.0;
		amount=principle+interest;
		
		System.out.println("Principle : "+principle);
		System.out.println("Rate      : "+rateofinterest);
		System.out.println("Time      : "+time);
		System.out.println("Interest  : "+interest);
		System.out.println("Amount    : "+amount);
		
	}
}

public abstract class Bank
{
	abstract public double getRateOfInterest();
}

public class SBI extends Bank
{
	public double getRateOfInterest()
	{
		return 8.4;
	}
}

public class ICICI extends Bank
{
	public double getRateOfInterest()
	{
		return 7.3;
	}
}

public class AXIS extends Bank
{
	public double getRateOfInterest()
	{
		return 9.7;
	}
}