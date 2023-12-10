// 4.	Write a Java program to concatenate a given string to the end of another string
import java.util.*;
public class ConcatenateString
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String first,second,total;
		System.out.print("Enter first string : ");
		first=in.nextLine();
		System.out.print("Enter second string : ");
		second=in.nextLine();
		total=first.concat(second);
		System.out.println("Final String : "+total);
	}
}