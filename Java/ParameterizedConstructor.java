// 2.	Write a Java program to implement the parameterized constructor.
import java.util.*;
public class ParameterizedConstructor
{
	public static void main(String args[])
	{
		int S;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a side : ");
		S=in.nextInt();
		
		Square sq=new Square(S);
		System.out.println("Area of square of side "+S+" is "+sq.area());
	}
}

public class Square
{
	int side;
	public Square(int S)
	{
		side=S;
	}
	public int area()
	{
		return side*side;
	}
}