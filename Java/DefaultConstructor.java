// Write a Java program to Implement default constructor

import java.util.*;
public class DefaultConstructor
{
	public static void main(String args[])
	{
		int S;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a side : ");
		S=in.nextInt();
		
		Square sq=new Square();
		sq.setSide(S);
		System.out.println("Area of square of side "+S+" is "+sq.area());
	}
}

public class Square
{
	int side;
	public Square()
	{
		side=0;
	}
	public void setSide(int S)
	{
		side=S;
	}
	public int area()
	{
		return side*side;
	}
}