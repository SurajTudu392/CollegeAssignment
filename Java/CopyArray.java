// Write a Java program to copy the elements of one array into another array
import java.util.Scanner;
public class CopyArray
{
	public static void main(String args[])
	{
		int n,i;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter size of array : ");
		n=in.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter "+n+" elements in array : ");
		for(i=0;i<n;i++)
		{
			System.out.print("arr["+i+"] : ");
			arr[i]=in.nextInt();
		}
		
		int newarr[]=new int[arr.length];
		for(i=0;i<arr.length;i++)
			newarr[i]=arr[i];
		
		System.out.print("Original Array : [ ");
		for(int x:arr)
			System.out.print(x+" , ");
		System.out.println("\b\b]");
		
		System.out.print("New Array : [ ");
		for(int x:newarr)
			System.out.print(x+" , ");
		System.out.println("\b\b]");
	}
}