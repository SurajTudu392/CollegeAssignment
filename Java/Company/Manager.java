/*
Write a Java program to create a class called Employee with methods called work() and getSalary().
Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().
*/

import java.util.*;

public class Manager
{
	public static void main(String args[])
	{
		HRManager manager=new HRManager();
		int numberOfEmployee=(int)(Math.random()*10)+1;
		for(int i=0;i<numberOfEmployee;i++)
		{
			Employee emp=new Employee((int)(Math.random()*20000)+10000);
			manager.addEmployee(emp);
		}
		manager.ListEmployee();
	}
}
public class Employee
{
	String Work;
	long Salary;
	public Employee()
	{
		Salary=0;
		Work="No work is assigned . ";
	}
	public Employee(long Salary)
	{
		this.Salary=Salary;
		Work="No work is assigned . ";
	}
	public Employee(long Salary,String Work)
	{
		this.Salary=Salary;
		this.Work=Work;
	}
	public void work(String Work)
	{
		this.Work=Work;
	}
	public long getSalary()
	{
		return Salary;
	}
	public String toString()
	{
		return "Work : "+Work+"\nSalary : "+Salary+"\n";
	}
}

public class HRManager extends Employee
{
	ArrayList<Employee> List=new ArrayList<Employee>();
	
	public void work(String Work)
	{
		super.Work=Work+"[Assigned by HR]";
	}
	public void addEmployee(Employee emp)
	{
		String works[]={"Program And Coding","Design Algorithm","Testing And Debugging","Resource Collecting","Commercial And Advertisment"};
		emp.work(works[(int)(Math.random()*works.length)]);
		List.add(emp);
	}
	public void ListEmployee()
	{
		int x=0;
		for(Employee emp:this.List)
		{
			System.out.println(++x+". "+emp);
		}
	}
}