// Write a Java Program to Find GCD of Two Numbers
import java.util.Scanner;
public class GreatestCommonDivisor
{
	public static void main(String args[])throws Exception
	{
		int x,y,r;
		System.out.print("Enter first number  : ");
		Scanner in=new Scanner(System.in);
		x=in.nextInt();
		System.out.print("Enter second number :");
		y=in.nextInt();
		System.out.printf("Greatest common divisor of %d and %d is ",x,y);
		while(x%y!=0)
		{
			r=x%y;
			x=y;
			y=r;
		}
		System.out.printf("%d .",y);
	}
}