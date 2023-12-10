// Write a Java program to Implement constructor overloading

import java.util.*;
public class OverloadedConstructor
{
	public static void main(String args[])
	{
		int S;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a side : ");
		S=in.nextInt();
		
		Square sq=new Square(S);
		System.out.println("Area of square of side "+S+" is "+sq.area());
		
		Square sq2=new Square(sq);
		System.out.println("Area of square of side "+S+" is "+sq2.area());
		
		Square sq3=new Square();
		System.out.println("Area of default square is "+sq3.area());
	}
}

public class Square
{
	int side;
	public Square()
	{
		side=0;
	}
	public Square(int S)
	{
		side=S;
	}
	public Square(Square SQ)
	{
		side=SQ.side;
	}
	public int area()
	{
		return side*side;
	}
}