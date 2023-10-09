// Write a Java Program to Find Square Root of a Number Without sqrt Method
import java.util.Scanner;
public class SquareRoot
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		double number,factor,squareroot=0;
		int numberofdigits,iterate,digit=0;
		System.out.print("Enter a number : ");
		number=input.nextDouble();
		numberofdigits=(String.valueOf(number)).length();
		factor=Math.pow(10,String.valueOf(number).substring(0,String.valueOf(number).indexOf('.')).length());
		for(iterate=0;iterate<numberofdigits+15;iterate++)
		{
			digit=0;
			while((squareroot+digit*factor)*(squareroot+digit*factor)<=number)
				digit++;
			squareroot=squareroot+factor*(digit-1);
			factor=factor/10;
		}
		System.out.println("Square root of "+number+" is "+squareroot);
	}
}