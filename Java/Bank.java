/*
Write a Java program to create a class called BankAccount with private instance variables accountNumber and balance.
Provide public getter and setter methods to access and modify these variables.
*/

import java.util.*;
import java.io.*;

public class Bank
{
	public static void main(String args[])
	{
		long AC,B;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Account Number : ");
		AC=in.nextLong();
		System.out.print("Enter Balance        : ");
		B=in.nextLong();
		System.out.println();
		BankAccount sbi=new BankAccount(AC,B);
		System.out.println("Bank Acount Number : "+sbi.getAccountNumber());
		System.out.println("Bank Balance       : "+sbi.getBalance());
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println();
		BankAccount axis=new BankAccount();
		System.out.print("Enter Account Number : ");
		AC=in.nextLong();
		System.out.print("Enter Balance        : ");
		B=in.nextLong();
		System.out.println();
		axis.setAccountNumber(AC);
		axis.setBalance(B);
		System.out.println("Bank Acount Number : "+axis.getAccountNumber());
		System.out.println("Bank Balance       : "+axis.getBalance());
		
	}
}
public class BankAccount
{
	private long accountNumber,balance;
	public BankAccount()
	{
		accountNumber=0;
		balance=0;
	}
	public BankAccount(long accountNumber,long balance)
	{
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	public void setAccountNumber(long accountNumber)
	{
		this.accountNumber=accountNumber;
	}
	public void setBalance(long balance)
	{
		this.balance=balance;
	}
	public long getAccountNumber()
	{
		return accountNumber;
	}
	public long getBalance()
	{
		return balance;
	}
}