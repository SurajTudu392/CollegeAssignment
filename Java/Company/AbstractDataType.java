/*
To implement a Java interface for ADT Stack by implementing this interface using array and 
to provide necessary exception handling in both the implementations.
*/

import java.util.*;
import java.lang.reflect.Array;
import java.io.*;
public class AbstractDataType
{
	public static void main(String args[])throws Exception
	{
		AbstractDataType.clear();
		int size,value;
		String choice;
		Scanner in=new Scanner(System.in);
		InputStreamReader input=new InputStreamReader(System.in);
		BufferedReader read=new BufferedReader(input);
		Integer number=Integer.valueOf(0);
		System.out.println("For Array Stack       : [Enter \"Array\"]");
		System.out.println("For Linked List Stack : [Enter \"List\"]");
		System.out.print("Enter a Type of Stack : ");
		String type=read.readLine();
		type=type.toLowerCase();
		
		switch(type)
		{
			case "array":
				System.out.println("Enter size of Stack : ");
				size=in.nextInt();
				
				StackArray<Integer> stack=new StackArray<Integer>(number.getClass(),size);
				loop:
				while(true)
				{
					try{
					System.out.print(">>");
					choice=read.readLine();
					switch(choice.toLowerCase())
					{
						case "help":
						AbstractDataType.help();
						break;
						case "clear":
							AbstractDataType.clear();
						break;
						case "exit":
							System.exit(0);
						break;
						case "push":
							System.out.print("Enter value [number] : ");
							value=in.nextInt();
							stack.push(value);
						break;
						case "pop":
							value=stack.pop();
							System.out.println("Value [Poped] : "+value);
						break;
						case "peek":
							value=stack.peek();
							System.out.println("Value [Peeked] : "+value);
						break;
						case "display":
							System.out.println(stack);
						break;
					}
					}catch(Exception e)
					{
						System.out.println(e);
					}
				}
			case "list":
				StackList<Integer> stacklist=new StackList<Integer>();
				loop:
				while(true)
				{
					try{
					System.out.print(">>");
					choice=read.readLine();
					switch(choice.toLowerCase())
					{
						case "help":
							AbstractDataType.help();
						break;
						case "clear":
							AbstractDataType.clear();
						break;
						case "exit":
							System.exit(0);
						break;
						case "push":
							System.out.print("Enter value [number] : ");
							value=in.nextInt();
							stacklist.push(value);
						break;
						case "pop":
							value=stacklist.pop();
							System.out.println("Value [Poped] : "+value);
						break;
						case "peek":
							value=stacklist.peek();
							System.out.println("Value [Peeked] : "+value);
						break;
						case "display":
							System.out.println(stacklist);
						break;
					}
					}catch(Exception e)
					{
						System.out.println(e);
					}
				}
			case "exit":
				System.exit(0);
		}
	}
	static void clear()
	{
		try  
		{  
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();  
		}  
		catch (Exception e)  
		{  
			e.printStackTrace();  
		} 
	}
	static void help()
	{
		System.out.println("Operation : ");
		System.out.println("  Help");
		System.out.println("  Clear");
		System.out.println("  Exit");
		System.out.println("  Push");
		System.out.println("  Pop");
		System.out.println("  Peek");
		System.out.println("  Display");
	}
}

//-----  Interface  -----
public interface Stack<D>
{
	public void push(D element)throws StackError;
	public D pop()throws StackError;
	public D peek()throws StackError;
}
//-----------------------

//-----  Stack Array -----
public class StackArray<D> implements Stack<D>
{
	int pointer=-1;
	D stack[];
	int size;
	public <M> StackArray(Class<M> group,int size)
	{
		this.size=size;
		stack=(D[])Array.newInstance(group,size);
	}
	public void push(D element)throws StackError
	{
		if(pointer+1>=size)
			throw new StackError("Stack Overflow.");
		else
			stack[++pointer]=element;
	}
	public D pop()throws StackError
	{
		if(pointer==-1)
			throw new StackError("Stack Underflow.");
		else
			return stack[pointer--];
	}
	public D peek()throws StackError
	{
		if(pointer==-1)
			throw new StackError("Stack Underflow.");
		return stack[pointer];
	}
	public String toString()
	{
		String group="[ ";
		if(pointer<0)
			group+="]";
		for(int i=0;i<=pointer;i++)
			if(i==pointer)
				group+=stack[i]+" ]";
			else
				group+=stack[i]+" , ";
		//group=group.substring(0,group.length()-2)+"]";
		return group;
	}
}


public class StackList<D> implements Stack<D>
{
	static StackList previousnode=null;
	StackList<D> node;
	D value;
	int index;
	static int size=0;
	public StackList()
	{
		node=null;
		index=-1;
	}
	public void push(D element)throws StackError
	{
		if(size==0)
		{
			value=element;
			index=0;
			size=1;
		}
		else
		{
			if(node==null)
			{
				node=new StackList<D>();
				node.value=element;
				node.index=index+1;
				size+=1;
				previousnode=this;
			}
			else
			{
				node.push(element);
			}
		}
	}
	public D pop()throws StackError
	{
		if(size==0)
			throw new StackError("Stack Underflow");
		else
		{
			if(node==null)
			{
				if(previousnode==null)
				{
					size=0;
					index=index-1;
					return value;
				}
				else
				{
					previousnode.node=null;
					index=index-1;
					size=size-1;
					return value;
				}
			}
			else
			{
				return node.pop();
			}
		}
		
	}
	public D peek()throws StackError
	{
		if(size==0)
			throw new StackError("Stack Underflow");
		else
		{
			if(node==null)
			{
				return value;
			}
			else
			{
				return node.peek();
			}
		}
	}
	public String display()
	{
		if(size==0)
			return "";
		else
		{
			if(node==null)
			{
				return ""+value+"";
			}
			else
			{
				return ""+value+","+node.display();
			}
		}
	}
	public String toString()
	{
		return "["+display()+"]";
	}
}



public class StackError extends Exception
{
	private String message;
	public StackError()
	{
		message="Stack Exception . ";
	}
	public StackError(String msg)
	{
		message=msg;
	}
	public String getMessage()
	{
		return message;
	}
	public String toString()
	{
		return message;
	}
}