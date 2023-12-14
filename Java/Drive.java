/*
2.	Write a Java program to create a class Vehicle with a method called speedUp().
Create two subclasses Car and Bicycle.
Override the speedUp() method in each subclass to increase the vehicle's speed differently.
*/

import java.util.*;

public class Drive
{
	public static void main(String args[])
	{
		Vehicle Suzuki=new Car();
		Vehicle Hero=new Bicycle();
		Suzuki.speedUp();
		Hero.speedUp();
		Hero.speedUp();
		Suzuki.speedUp();
	}
}

public class Vehicle
{
	double speed=0;
	public void speedUp()
	{
		System.out.print("Vehicle speed increase from "+speed);
		speed+=5.0;
		System.out.println(" to "+speed);
	}
}

public class Car extends Vehicle
{
	public void speedUp()
	{
		System.out.print("Car speed increase from "+speed);
		speed+=10.0;
		System.out.println("km/h to "+speed+" km/h");
	}
}

public class Bicycle extends Vehicle
{
	public void speedUp()
	{
		System.out.print("Bicycle speed increase from "+speed);
		speed+=2.0;
		System.out.println(" km/h to "+speed+" km/h");
	}
}