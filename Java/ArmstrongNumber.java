// Write a Java Program to Armstrong Number in Java
import java.util.*;
public class ArmstrongNumber
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int N,D,M,S=0;
		System.out.print("Enter a number : ");
		N=in.nextInt();
		M=N;
		if(N<0)
		{
			System.out.println("Invalid entry .\nOnly whole numbers are allowed.");
			System.exit(1);
		}
		D=(int)(Math.log(N*10+1)/Math.log(10));
		while(M>0)
		{
			S+=(int)Math.pow(M%10,D);
			M=M/10;
		}
		if(N==S)System.out.println(N+" is an armstrong number .");
		else System.out.println(N+" is not an armstrong number .");
	}
}