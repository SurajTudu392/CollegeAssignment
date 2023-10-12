// Write a Java Program to Reverse a Number in Java
import java.util.Scanner;
public class Reverse
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n,s=0,m;
		System.out.print("Enter a number : ");
		n=in.nextInt();
		if(n<0)
		{
			System.out.println(n+" is not a natural number .");
			System.exit(1);
		}
		m=n;
		while(m>0)
		{
			s=s*10+m%10;
			m=m/10;
		}
		System.out.println("Reverse of "+n+" is "+s);
	}
}