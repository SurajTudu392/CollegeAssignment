// Write a Java Program to Fibonacci Series in Java
import java.io.*;
public class Fibonacci
{
	public static void main(String args[])throws IOException
	{
		Integer N,I,A=0,B=1;
		InputStreamReader ob=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(ob);
		System.out.print("Enter a number of terms in a series : ");
		N=Integer.parseInt(in.readLine());
		for(I=1;I<=N;I++)
		{
			System.out.print(A+((I<N)?" , ":" ."));
			B=A+B;
			A=B-A;
		}
		
	}
}