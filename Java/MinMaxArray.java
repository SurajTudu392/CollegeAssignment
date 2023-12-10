// Write a Java program to find the maximum and minimum element in an array.

import java.util.*;
public class MinMaxArray
{
	public static void main(String args[])
	{
		int n,i,min,max;
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
		min=arr[0];
		max=arr[0];
		for(i=1;i<n;i++)
		{
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Maximum : "+max);
		System.out.println("Minimum : "+min);
	}
	
}