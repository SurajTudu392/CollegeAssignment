/*
To implement a Java interface for ADT Stack by implementing this interface using array and 
to provide necessary exception handling in both the implementations.
*/

import java.util.*;

public class AbstractDataType
{
	public static void main(String args[])throws Exception
	{
		StackArray<Integer> stack=new StackArray<Integer>();
		stack.pop();
		System.out.println(stack);
	}
}
public interface Stack<D>
{
	public void push(D element)throws StackError;
	public D pop()throws StackError;
	public D peek()throws StackError;
}

public class StackArray<D> implements Stack<D>
{
	int pointer=-1;
	D stack[];
	public StackArray(int size)
	{
		stack=new D[size];
	}
	public void push(D element)throws StackError
	{
		if(pointer+1>=size)
			throw new StackError("Stack Overflow.");
		
		else
			stack[pointer++]=element;
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
		String group="[";
		for(D x:stack)
			group+=x+" , ";
		group=group.substring(0,group.length()-2)+"]";
		return group;
	}
}

public class StackLinkedList<D> implements Stack<D>
{
	static StackLinkedList<D> previousnode;
	int size;
	int index;
	D value;
	StackLinkedList<D> node;
	public StackLinkedList()
	{
		size=0;
		node=null;
		int index=-1;
	}
	public void push(D element)throws StackError
	{
		push(element,this,-1);
	}
	private void push(D element,StackLinkedList<D> stack,int index)throws StackError
	{
		if(stack.node==null)
		{
			StackLinkedList<D> newNode=new StackLinkedList<D>();
			newNode.index=index+1;
			newNode.value=element;
			newNode.node=null;
			size++;
		}
		else
		{
			push(element,stack.node,index+1);
		}
	}
	public D pop()throws StackError
	{
		if(size<=0)
			throw new StackError("Stack Underflow.");
		if(this.node==null)
		{
			previousnode.node=null;
			
			return value;
		}
		else
		{
			previousnode=this;
			this.node.pop();
		}
	}
	public D peek()throws StackError
	{
		if(size<=0)
			throw new StackError("Stack Underflow.");
		if(this.node==null)
		{	
			return value;
		}
		else
		{
			previousnode=this;
			this.node.pop();
		}
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