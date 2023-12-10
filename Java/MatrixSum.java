// Write a Java program to add the two matrices.
import java.util.*;
public class MatrixSum
{
	public static void main(String args[])
	{
		int r,c,i,j;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter dimension of Matrix : ");
		System.out.print("\tRow    : ");
		r=in.nextInt();
		System.out.print("\tColumn : ");
		c=in.nextInt();
		int A[][]=new int[r][c];
		int B[][]=new int[r][c];
		int C[][]=new int[r][c];
		
		System.out.println("Enter "+(r*c)+" elements in Matrix A :");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print("A["+i+"]["+j+"] : ");
				A[i][j]=in.nextInt();
			}
		}
		
		System.out.println("Enter "+(r*c)+" elements in Matrix B :");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print("B["+i+"]["+j+"] : ");
				B[i][j]=in.nextInt();
			}
		}
		
		for(i=0;i<r;i++)
			for(j=0;j<c;j++)
				C[i][j]=A[i][j]+B[i][j];
		
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
				System.out.print(A[i][j]+"\t");
			System.out.print("\t");
			if(i==r/2)
				System.out.print("+");
			System.out.print("\t");
			for(j=0;j<c;j++)
				System.out.print(B[i][j]+"\t");
			System.out.print("\t");
			if(i==r/2)
				System.out.print("=");
			System.out.print("\t");
			for(j=0;j<c;j++)
				System.out.print(C[i][j]+"\t");
			System.out.println();
		}
	}
}