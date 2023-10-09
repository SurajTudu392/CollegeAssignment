//Write a Java Program to How to Generate Random Number in Java
import java.util.Scanner;
public class RandomNumber
{
	public static void main(String args[])
	{
		Scanner take=new Scanner(System.in);
		double upperbound,lowerbound;
		System.out.println("Enter range of random number : ");
		System.out.print("Lower bound : ");
		lowerbound=take.nextDouble();
		System.out.print("Upper bound : ");
		upperbound=take.nextDouble();
		double randomnumber=lowerbound+(upperbound-lowerbound)*Math.random();
		System.out.println("Random number : "+randomnumber);
	}
}