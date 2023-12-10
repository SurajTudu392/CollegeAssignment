// Write a Java Program to Reverse Each Word of a String.

import java.io.*;
public class ReverseWordOrder
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader input=new InputStreamReader(System.in);
		BufferedReader read=new BufferedReader(input);
		System.out.print("Enter a sentence : ");
		String sentence=read.readLine();
		String words[]=sentence.split(" ");
		String new_sentence="";
		for(String word:words)
		{
			new_sentence=word+" "+new_sentence;
		}
		System.out.println("New Sentence : \" "+new_sentence+" \"");
	}
}