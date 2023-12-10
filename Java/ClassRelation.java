// Write a Java program to create an object of a class as a data member in another class.

import java.util.*;

public class ClassRelation
{
	public static void main(String args[])
	{
		Window window=new Window(1,Location.EAST,40,40);
		Door door=new Door(1,Location.NORTH,70,40);
		Room myroom=new Room(1,100,100,door,window);
		System.out.println(myroom);
	}
}

enum Location
{
	EAST,WEST,NORTH,SOUTH;
}
class Room
{
	int id;
	int height,width;
	Window window1;
	Door door1;
	public Room(int id,int height,int width,Door door,Window window)
	{
		window1=window;
		door1=door;
		this.id=id;
		this.height=height;
		this.width=width;
	}
	public String toString()
	{
		return "Room "+id+" : ["+height+"x"+width+"] ["+window1+" , "+door1+"]";
	}
}

class Window
{
	int id;
	int height,width;
	Location where;
	Window(int id,Location locate,int height,int width)
	{
		this.id=id;
		where=locate;
		this.height=height;
		this.width=width;
	}
	public String toString()
	{
		return "window"+id+" : ["+String.valueOf(where)+" , "+height+"x"+width+"]";
	}
}


class Door
{
	int id;
	int height,width;
	Location where;
	Door(int id,Location locate,int height,int width)
	{
		this.id=id;
		where=locate;
		this.height=height;
		this.width=width;
	}
	public String toString()
	{
		return "door"+id+" : ["+String.valueOf(where)+" , "+height+"x"+width+"]";
	}
}