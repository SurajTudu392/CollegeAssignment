// Write a Java Program to Find Sum of Natural Numbers
import java.util.Scanner;
public class SumOfSeries
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n,s=0,i;
		System.out.print("Enter a number : ");
		n=in.nextInt();
		if(n<1)
		{
			System.out.println(n+" is not a natural number .");
			System.exit(1);
		}
		for(i=1;i<=n;i++)
		{
			s=s+i;
			System.out.print(i+((i<n)?" + ":" = "));
		}
		System.out.println(s);
	}
}