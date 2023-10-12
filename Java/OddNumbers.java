// Write a Java Program to Display Odd Numbers From 1 to 100
public class OddNumbers
{
	public static void main(String args[])
	{
		int i;
		for(i=1;i<=100;i=i+2)
			System.out.print(i+""+((i<99)?" , ":" ."));
	}
}
