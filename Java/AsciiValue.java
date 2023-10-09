//Write a Java Program to Print ASCII Value in Java.
import java.util.Scanner;
public class AsciiValue
{
	public static void main(String args[])
	{
		Scanner accept=new Scanner(System.in);
		char character;
		System.out.print("Enter a character : ");
		character=accept.next().charAt(0);
		int AsciiNumber=(int)character;
		System.out.println("Ascii value of "+character+" is "+AsciiNumber);
	}
}