// Write a Java program to read n number of values in an array and display it in reverse order.

import java.util.Scanner;
public class ReverseArray
{
	public static void main(String args[])
	{
		int n,i;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter size of array : ");
		n=in.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter "+n+" numbers in array :");
		for(i=0;i<n;i++)
		{
			System.out.print("arr["+i+"]:");
			arr[i]=in.nextInt();
		}
		System.out.print("Original Array : [ ");
		for(int x:arr)
			System.out.print(x+" , ");
		System.out.println("\b\b]");
		
		System.out.print("Displaying in reverse order : ");
		for(int x=n-1;x>=0;x--)
			System.out.print(arr[x]+" , ");
		System.out.println("\b\b.");
	}
}