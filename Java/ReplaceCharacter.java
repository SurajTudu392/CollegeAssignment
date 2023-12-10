//Write a Java program to replace a specified character with another character.

import java.io.*;
public class ReplaceCharacter
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader input=new InputStreamReader(System.in);
		BufferedReader read=new BufferedReader(input);
		System.out.print("Enter a sentence : ");
		String sentence=read.readLine();
		System.out.print("Enter a character to be replaced : ");
		char remove=read.readLine().charAt(0);
		System.out.print("Enter a character to be inserted : ");
		char insert=read.readLine().charAt(0);
		String new_sentence=sentence.replace(remove,insert);
		System.out.println("New Sentence : \" "+new_sentence+" \"");
	}
}