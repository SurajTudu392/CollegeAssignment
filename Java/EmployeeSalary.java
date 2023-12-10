/* Write a Java program to create a class called Employee with private instance
variables employee_id, employee_name, and employee_salary. Provide public
getter and setter methods to access and modify the id and name variables, but
provide a getter method for the salary variable that returns a formatted string.
*/
import java.util.*;
import java.io.*;
public class EmployeeSalary
{
	public static void main(String args[])throws IOException
	{
		int id;
		String name,salary;
		InputStreamReader stream=new InputStreamReader(System.in);
		BufferedReader read=new BufferedReader(stream);
		Scanner in=new Scanner(System.in);
		System.out.print("ENTER EMPLOYEE ID   	: ");
		id=in.nextInt();
		System.out.print("ENTER EMPLOYEE NAME 	: ");
		name=read.readLine();
		System.out.print("ENTER EMPLOYEE SALARY : ");
		salary=read.readLine();
		Employee emp1=new Employee(id,name,salary);
		
		System.out.println();
		System.out.println("Employee Id     : "+emp1.getId());
		System.out.println("Employee Name   : "+emp1.getName());
		System.out.println("Employee Salary : "+emp1.getSalary());
		
		System.out.println();
		System.out.print("ENTER NEW EMPLOYEE ID   : ");
		id=in.nextInt();
		System.out.print("ENTER NEW EMPLOYEE NAME : ");
		name=read.readLine();
		
		emp1.setId(id);
		emp1.setName(name);
		
		System.out.println();
		System.out.println("Employee Id     : "+emp1.getId());
		System.out.println("Employee Name   : "+emp1.getName());
		System.out.println("Employee Salary : "+emp1.getSalary());
		
	}
}

public class Employee
{
	private int employee_id;
	private String employee_salary;
	private String employee_name;
	public Employee()
	{
		employee_id=0;
		employee_name="Unknown";
		employee_salary="0";
	}
	public Employee(int id,String name,String salary)
	{
		employee_id=id;
		employee_name=name;
		employee_salary=salary;
	}
	
	public void setId(int id)
	{
		employee_id=id;
	}
	public void setName(String name)
	{
		employee_name=name;
	}
	public int getId()
	{
		return employee_id;
	}
	
	public String getName()
	{
		return employee_name;
	}
	public String getSalary()
	{
		return employee_salary;
	}
}