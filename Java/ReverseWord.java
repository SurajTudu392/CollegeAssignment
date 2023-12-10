// Write a Java Program Reverse Each Word of a String.

import java.io.*;
public class ReverseWord
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
			new_sentence=new_sentence+new StringBuffer(word).reverse().toString()+" ";
		}
		System.out.println("New Sentence : \" "+new_sentence+" \"");
	}
}