// Write a Java Program to Find nth Prime Number
import java.util.*;
import java.util.ArrayList;
public class NthPrime
{
	public static void main(String args[])
	{
		Integer N,Iterate=0,IN=2,CURRENT=0;
		Boolean Prime;
		Scanner in=new Scanner(System.in);
		System.out.print("Please enter which prime number you want ? : ");
		N=in.nextInt();
		if(N<=0)
		{
			System.err.println("Zero and negative numbers are not allowed. ");
			System.exit(0);
		}
		ArrayList<Integer> listOfPrimeNumber=new ArrayList<Integer>();
		for(Iterate=1;Iterate<=N;)
		{
			Prime=true;
			Inner:
			for(int I:listOfPrimeNumber)
			{
				if(I>Math.sqrt(IN))
					break Inner;
				if(IN%I==0)
					Prime=false;
			}
			if(Prime)
			{
				listOfPrimeNumber.add(IN);
				CURRENT=IN;
				Iterate++;
			}
			IN++;
		}
		System.out.println(N+((N==1)?"st":(N==2)?"nd":(N==3)?"rd":"th")+" prime number is "+CURRENT);
	}
}