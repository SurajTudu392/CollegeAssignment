/*
To implement file handling by creating a Java program that reads a file name from the user, displays 
information about whether the file exists, whether the file is readable, or writable, the type of file and the length of the file in bytes.
*/

import java.io.*;
public class FileChecker
{
	public static void main(String args[])throws IOException
	{
		BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter file name : ");
		String name=read.readLine();
		File file=new File(name);
		System.out.println("File \""+name+"\" Exits       : "+file.exists());
		System.out.println("File \""+name+"\" is Readable : "+file.canRead());
		System.out.println("File \""+name+"\" is Writable : "+file.canWrite());
		System.out.println("File \""+name+"\" Type        : "+(file.isDirectory()?"Directory":"File"));
		if(file.exists())
		if(file.isFile())
			System.out.println("File \""+name+"\" Size        : "+file.length()+((file.length()<=1)?"byte":" bytes"));
		else
			System.out.println("File \""+name+"\" Size        : "+FileChecker.TheDirectoryWalk(file)+((file.length()<=1)?"byte":" bytes"));
		else
			System.out.println("File \""+name+"\" Size        : 0 byte");
	}
	public static long TheDirectoryWalk(File file)
	{
		if(file.isFile())
		{
			return file.length();
		}
		else
		{
			long sum=0;
			for(File x:file.listFiles())
			{
				sum+=TheDirectoryWalk(x);
			}
			return sum;
		}
	}
}
