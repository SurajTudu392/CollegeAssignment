/*
Write a Java program to create a class called Rectangle with private instance variables length and width.
Provide public getter and setter methods to access and modify these variables.
*/

import java.util.*;
public class RectangleMaker
{
	public static void main(String args[])
	{
		Scanner in=new  Scanner(System.in);
		System.out.print("Enter length of rectangle : ");
		int L=in.nextInt();
		System.out.print("Enter breadth of rectangle : ");
		int B=in.nextInt();
		System.out.println();
		Rectangle boxA=new Rectangle(L,B);
		System.out.println("Rectangle - boxA : Length  : "+boxA.getLength());
		System.out.println("Rectangle - boxA : Breadth : "+boxA.getBreadth());
		System.out.println("Area of rectangle - boxA   : "+(boxA.getLength()*boxA.getBreadth()));
		
		Rectangle boxB=new Rectangle();
		
		System.out.println();
		System.out.println("----------------------------------------------");
		System.out.println();
		System.out.print("Enter length of rectangle : ");
		L=in.nextInt();
		System.out.print("Enter breadth of rectangle : ");
		B=in.nextInt();
		System.out.println();
		boxB.setLength(L);
		boxB.setBreadth(B);
		System.out.println("Rectangle - boxB : Length  : "+boxB.getLength());
		System.out.println("Rectangle - boxB : Breadth : "+boxB.getBreadth());
		System.out.println("Area of rectangle - boxB   : "+(boxB.getLength()*boxB.getBreadth()));
		
		System.out.println();
		System.out.println("----------------------------------------------");
		System.out.println();
		System.out.print("Enter length of rectangle : ");
		L=in.nextInt();
		System.out.print("Enter breadth of rectangle : ");
		B=in.nextInt();
		System.out.println();
		boxB.setDimension(L,B);
		System.out.println("Rectangle - boxB : Length  : "+boxB.getLength());
		System.out.println("Rectangle - boxB : Breadth : "+boxB.getBreadth());
		System.out.println("Area of rectangle - boxB   : "+(boxB.getLength()*boxB.getBreadth()));
	}
}

public class Rectangle
{
	private int length,breadth;
	
	public Rectangle()
	{
		length=0;
		breadth=0;
	}
	public Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public void setLength(int length)
	{
		this.length=length;
	}
	public void setBreadth(int breadth)
	{
		this.breadth=breadth;
	}
	public void setDimension(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public int getLength()
	{
		return length;
	}
	public int getBreadth()
	{
		return breadth;
	}
}
