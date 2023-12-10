/*
Q.Write a Java program to create a base class Animal (Animal Family) with a method called Sound().
Create two subclasses Bird and Cat.
Override the Sound() method in each subclass to make a specific sound for each animal.
*/

public class Zoo
{
	public static void main(String args[])
	{
		Animal cat=new Cat();
		cat.Sound();
		
		Animal bird=new Bird();
		bird.Sound();
		
		
	}
}

public class Animal
{
	public void Sound()
	{
		System.out.println("Animal Sound ... ");
	}
}

public class Cat extends Animal
{
	@Override
	public void Sound()
	{
		System.out.println("Meaw ... ");
	}
}

public class Bird extends Animal
{
	@Override
	public void Sound()
	{
		System.out.println("Koow ... ");
	}
}