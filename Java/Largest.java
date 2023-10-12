// Write a Java Program to Find Largest of Three Numbers
import java.util.*;
public class Largest
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int x,y,z,largest;
		System.out.print("Enter a number : x : ");
		x=in.nextInt();
		System.out.print("Enter a number : y : ");
		y=in.nextInt();
		System.out.print("Enter a number : z : ");
		z=in.nextInt();
		largest=(x>y&&x>z)?x:(y>x&&y>z)?y:z;
		System.out.printf("Largest of [%d,%d,%d] is %d . ",x,y,z,largest);
	}
}