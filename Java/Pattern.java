// Write a Java Program to Print Pattern in Java
public class Pattern
{
	public static void main(String args[])
	{
		int I,J;
		
		/*
			Pattern 1:
			      * 
			    * * *
			  * * * * * 
			* * * * * * *
		*/
		System.out.println("Pattern 1 : \n");
		for(I=7;I>=1;I=I-2)
		{
			for(J=1;J<=7;J++)
			{
				if(J<I)
					System.out.print(" ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
		/*
			Pattern 1:
			* * * * *
			  * * * *
			    * * *
			      * *
			        *
		*/
		
		System.out.println("\nPattern 2 : \n");
		for(I=1;I<=5;I++)
		{
			for(J=1;J<=5;J++)
			{
				if(J<I)
					System.out.print("  ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
	}
}