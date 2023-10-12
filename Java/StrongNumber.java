// Write a Java Program to Find  Strong Number.
import java.util.*;
public class StrongNumber
{
	public static void main(String args[])
	{
		int n,x,s=0,r,f;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a number : ");
		n=in.nextInt();
		x=n;
		while(x>0)
		{
			r=x%10;
			f=1;
			for(int i=1;i<=r;i++)f*=i;
			s=s+f;
			x=x/10;
		}
		if(n==s)
			System.out.println(n+" is a strong number .");
		else
			System.out.println(n+" is not a strong number .");
	}
}