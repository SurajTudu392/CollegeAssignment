// Write a Java program to Implement copy constructor
import java.util.*;
public class CopyConstructor
{
	public static void main(String args[])
	{
		int S;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a side : ");
		S=in.nextInt();
		
		Square sq=new Square(S);
		
		Square sq2=new Square(sq);
		System.out.println("Area of square of side "+S+" is "+sq2.area());
	}
}

public class Square
{
	int side;
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