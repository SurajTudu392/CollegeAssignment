
// Write a Java Program to Find Smallest of Three Numbers Using Ternary Operator
import java.util.*;
public class Smallest
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int x,y,z,smallest;
		System.out.print("Enter a number : x : ");
		x=in.nextInt();
		System.out.print("Enter a number : y : ");
		y=in.nextInt();
		System.out.print("Enter a number : z : ");
		z=in.nextInt();
		smallest=(x<y&&x<z)?x:(y<x&&y<z)?y:z;
		System.out.printf("Smallest of [%d,%d,%d] is %d . ",x,y,z,smallest);
	}
}
 