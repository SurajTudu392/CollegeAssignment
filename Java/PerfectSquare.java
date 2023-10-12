// Write a Java Program to check if a Given Number is Perfect Square
import java.util.Scanner;
public class PerfectSquare
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n;
		System.out.print("Enter a number : ");
		n=in.nextInt();
		int r=(int)Math.sqrt(n);
		r=r*r;
		if(r==n)
			System.out.println(n+" is a perfect square .");
		else
			System.out.println(n+" is not a perfect square .");
	}
}