// Write a Java program that identifies the Even elements in two arrays and creates a third array with those elements.
import java.util.*;
public class EvenArrayList
{
	public static void main(String args[])
	{
		int n,m,i,count=0,j=0;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter size of first array : ");
		n=in.nextInt();
		int arrA[]=new int[n];
		System.out.println("Enter "+n+" elements in array : ");
		for(i=0;i<n;i++)
		{
			System.out.print("arr["+i+"] : ");
			arrA[i]=in.nextInt();
		}
		
		System.out.print("Enter size of second array : ");
		m=in.nextInt();
		int arrB[]=new int[m];
		System.out.println("Enter "+m+" elements in array : ");
		for(i=0;i<m;i++)
		{
			System.out.print("arr["+i+"] : ");
			arrB[i]=in.nextInt();
		}
		
		for(i=0;i<n;i++)
		{
			if(arrA[i]%2==0)
				count++;
		}
		
		for(i=0;i<m;i++)
		{
			if(arrB[i]%2==0)
				count++;
		}
		
		int arrC[]=new int[count];
		for(i=0;i<n;i++)
		{
			if(arrA[i]%2==0)
				arrC[j++]=arrA[i];
		}
		
		for(i=0;i<m;i++)
		{
			if(arrB[i]%2==0)
				arrC[j++]=arrB[i];
		}
		
		System.out.print("First Array : [ ");
		for(int x:arrA)
			System.out.print(x+" , ");
		System.out.println("\b\b]");
		
		System.out.print("Second Array : [ ");
		for(int x:arrB)
			System.out.print(x+" , ");
		System.out.println("\b\b]");
		
		System.out.print("Even elements Array : [ ");
		for(int x:arrC)
			System.out.print(x+" , ");
		System.out.println("\b\b]");
	}
}
