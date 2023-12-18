/*
1.Write a Java program to create a Animal interface with a method called bark() that takes no arguments and returns void.
Create a Dog class that implements Animal and overrides speak() to print "Dog is barking".
*/

public class Pet
{
	public static void main(String args[])
	{
		Dog spike=new Dog();
		spike.speak();
		spike.bark();
		
	}
}

public interface Animal
{
	public void bark();
	public default void speak()
	{
		System.out.println("Animal is making sound . ");
	}
}

public class Dog implements Animal
{
	public void bark()
	{
		System.out.println("Huaeuau .. Bau .. Bau .. ");
	}
	public void speak()
	{
		System.out.println("Dog is barking .");
	}
}