//Write a Java program to Swap Two Strings without Third String Variable.


import java.io.*;
public class SwapString
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader input=new InputStreamReader(System.in);
		BufferedReader read=new BufferedReader(input);
		
		System.out.print("Enter first string : ");
		String first=read.readLine();
		
		System.out.print("Enter second string : ");
		String second=read.readLine();
		
		
		first=first+second;
		second=first.substring(0,first.length()-second.length());
		first=first.substring(second.length());
		
		System.out.println("first : "+first);
		System.out.println("second : "+second);
		
	}
}