// Write a Java Program to check if a Number is Positive or Negative
import java.util.*;
public class PositiveAndNegative
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int number;
		System.out.print("Enter a number : ");
		number=in.nextInt();
		System.out.printf("%d is %s",number,(number>0)?"positive number .":(number<0)?"negative number .":"zero .");
	}
}