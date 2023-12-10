// Write a Java program to calculate the average value of array elements.
import java.util.*;
public class ArrayAverage
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n,i,total=0;
		double average;
		System.out.print("Enter size of array : ");
		n=in.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter "+n+" elements in array : ");
		for(i=0;i<n;i++)
		{
			System.out.print("arr["+i+"] : ");
			arr[i]=in.nextInt();
		}
		
		System.out.print("Original Array : [ ");
		for(int x:arr)
		{
			total=total+x;
			System.out.print(x+" , ");
		}
		System.out.println("\b\b]");
		average=total*1.0/n;
		
		System.out.println("Average : "+average);
	}
}