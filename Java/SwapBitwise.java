// Write a Java Program to Swap Two Numbers Using Bitwise Operator
import java.util.Scanner;
public class SwapBitwise
{
	public static void main(String args[])
	{
		/**
			x	or	and		y
			0	0	0		0
			0	1	0		1
			1	1	0		0
			1	1	1		1
			
				x^or^and =	y
			=>	y^or^and =	x
			
		**/
		int x,y,or,and;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter first number : ");
		x=in.nextInt();
		System.out.print("Enter second number : ");
		y=in.nextInt();
		or=x|y;
		and=x&y;
		x=x^or^and;
		y=x^or^and;
		System.out.println("x : "+x);
		System.out.println("y : "+y);
	}
}