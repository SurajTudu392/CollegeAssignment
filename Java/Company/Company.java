/*
To implement Inheritance by developing a java programme with Employee class with Emp_name, Emp_id, Address, Mail_id, Mobile_no as members.
Inherit the classes, Programmer, Assistant Professor, Associate Professor and Professor from employee class.
Add Basic Pay (BP) as the member of all the inherited classes with 97% of BP as DA, 10 % of BP as HRA, 12% of BP as PF, 0.1% of BP for staff club fund. 
Generate pay slips for the employees with their gross and net salary.
*/

import java.util.*;
import java.io.*;

public class Company
{
	public static void main(String args[])
	{
		Employee Emp1,Emp2,Emp3,Emp4;
		
		Emp1=new Programmer("David",213,"House number : A12 , Parker Street , New York , USA","DavidJohn791@outlook.com","6204215141",4150000);
		Emp2=new AssistantProfessor("Bhaskaraa",252,"House number : C23 , Northern Town , Jamshedpur , India","BhaskaraaX156@gmail.com","9132470581",4246000);
		Emp3=new AssociateProfessor("Adam",345,"House number : D02 , Vladimer Neighbourhood , St.Peterburg , Russia","Vladimer642@outlook.com","7206215006",3420000);
		Emp4=new Professor("Gurleen",13,"House number : 412 , Shikhar Chowk , Chandigarh , India ","Gurleen78@gmail.com","8224214045",2550000);
		
		System.out.println(Emp1);
		System.out.println();
		System.out.println();
		System.out.println(Emp2);
		System.out.println();
		System.out.println();
		System.out.println(Emp3);
		System.out.println();
		System.out.println();
		System.out.println(Emp4);
	}
}

public abstract class Employee
{
	String Emp_name,Address,Mail_id,Mobile_no;
	long Emp_id;
	double BasicPay,DA,HRA,PF,SCF,GrossPay,NetPay;
	public Employee(String name,long id,String address,String mail,String mobilenumber,double basicpay)
	{
		Emp_name=name;
		Emp_id=id;
		Address=address;
		Mail_id=mail;
		Mobile_no=mobilenumber;
		BasicPay=basicpay;
		DA=BasicPay*0.97;
		HRA=BasicPay*0.10;
		PF=BasicPay*0.12;
		SCF=BasicPay*0.001;
		GrossPay=BasicPay+DA+HRA;
		NetPay=GrossPay-PF-SCF;
	}
	
	public String getName()
	{
		return Emp_name;
	}
	public long getId()
	{
		return Emp_id;
	}
	public String getAddress()
	{
		return Address;
	}
	public String getMailId()
	{
		return Mail_id;
	}
	public String getMobileNumber()
	{
		return Mobile_no;
	}
	public double getBasicPay()
	{
		return BasicPay;
	}
	public double getDearnessAllowance()
	{
		return DA;
	}
	public double getHouseRentAllowance()
	{
		return HRA;
	}
	public double getProvidentFund()
	{
		return PF;
	}
	public double getStaffClubFund()
	{
		return SCF;
	}
	public double getGrossPay()
	{
		return GrossPay;
	}
	public double getNetPay()
	{
		return NetPay;
	}
	public abstract String getProfession();
	public String toString()
	{
		return 
		"Employee Name        : "+Emp_name+"\n"+
		"Employee Id          : "+Emp_id+"\n"+
		"Employee Address     : "+Address+"\n"+
		"Mail Id              : "+Mail_id+"\n"+
		"Mobile Number        : "+Mobile_no+"\n"+
		"Profession           : "+getProfession()+"\n"+
		"Basic Pay            : $"+BasicPay+"\n"+
		"Dearness Allowance   : $"+DA+"\n"+
		"House Rent Allowance : $"+HRA+"\n"+
		"Provident Fund       : $"+PF+"\n"+
		"Staff Club Fund      : $"+SCF+"\n"+
		"Gross Pay            : $"+GrossPay+"\n"+
		"Net Pay              : $"+NetPay+"\n";
	}
}

public class Programmer extends Employee
{
	public Programmer(String name,long id,String address,String mail,String mobilenumber,double basicpay)
	{
		super(name,id,address,mail,mobilenumber,basicpay);
	}
	public String getProfession()
	{
		return "Programmer";
	}
}


public class AssociateProfessor extends Employee
{
	public AssociateProfessor(String name,long id,String address,String mail,String mobilenumber,double basicpay)
	{
		super(name,id,address,mail,mobilenumber,basicpay);
	}
	public String getProfession()
	{
		return "Associate Professor";
	}
}


public class AssistantProfessor extends Employee
{
	public AssistantProfessor(String name,long id,String address,String mail,String mobilenumber,double basicpay)
	{
		super(name,id,address,mail,mobilenumber,basicpay);
	}
	public String getProfession()
	{
		return "Assistant Professor";
	}
}


public class Professor extends Employee
{
	public Professor(String name,long id,String address,String mail,String mobilenumber,double basicpay)
	{
		super(name,id,address,mail,mobilenumber,basicpay);
	}
	public String getProfession()
	{
		return "Professor";
	}
}
