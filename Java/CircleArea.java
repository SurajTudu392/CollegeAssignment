// Write a Java program to Find area of a circle using class and object.

import java.util.*;
import java.io.*;
public class CircleArea
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int radius;
		System.out.print("Enter radius of circle : ");
		radius=in.nextInt();
		Circle circle=new Circle(radius);
		System.out.println("Area of circle of radius "+circle.getRadius()+" is "+circle.area());
	}
}

public class Circle
{
	private int radius;
	public Circle()
	{
		radius=0;
	}
	public Circle(int rad)
	{
		radius=rad;
	}
	public void setRadius(int rad)
	{
		radius=rad;
	}
	public int getRadius()
	{
		return radius;
	}
	public double area()
	{
		return Math.PI*radius*radius;
	}
}