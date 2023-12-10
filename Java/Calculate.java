// To implement Constructors with parameters and without parameters by developing a java programme to calculate area.

public class Calculate
{
	public static void main(String args[])
	{
		Rectangle polygon1=new Rectangle(10,20);
		System.out.println("Area of Rectangle : "+polygon1.area());
		
		Rectangle polygon2=new Rectangle();
		polygon2.setDimension(30,5);
		System.out.println("Area of Rectangle : "+polygon2.area());
		
	}
}

public class Rectangle
{
	int length,breadth;
	public Rectangle()
	{
		length=0;
		breadth=0;
	}
	public Rectangle(int L,int B)
	{
		length=L;
		breadth=B;
	}
	public void setDimension(int L,int B)
	{
		length=L;
		breadth=B;
	}
	public int area()
	{
		return length*breadth;
	}
}