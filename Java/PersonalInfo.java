// Write a Java Program to print your name, date of birth, and mobile number
import java.util.Scanner;
public class PersonalInfo
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		String name,enrollmentnumber;
		class Date
		{
			int year,month,day;
			Date()
			{
				day=0;
				month=0;
				year=0;
			}
			Date(int day,int month,int year)
			{
				this.year=year;
				this.month=month;
				this.day=day;
			}
			String getDate()
			{
				return String.valueOf(day)+"/"+String.valueOf(month)+"/"+String.valueOf(year);
			}
			void setDate(int day,int month,int year)
			{
				this.year=year;
				this.month=month;
				this.day=day;
			}
			void setDate()
			{
				Scanner in=new Scanner(System.in);
				System.out.print("Day   : ");
				this.day=in.nextInt();
				System.out.print("Month : ");
				this.month=in.nextInt();
				System.out.print("Year  : ");
				this.year=in.nextInt();
			}
		}
		Date dateofbirth=new Date();
		long mobilenumber;
		System.out.print("Enter your name : ");
		name=input.nextLine();
		System.out.print("Enter your enrollment number : ");
		enrollmentnumber=input.nextLine();
		System.out.println("Enter your date of birth : ");
		dateofbirth.setDate();
		System.out.print("Enter your mobile number : ");
		mobilenumber=input.nextLong();
		System.out.println();
		System.out.println("Personal Information : ");
		System.out.println("Name              : "+name);
		System.out.println("Enrollment number :"+enrollmentnumber);
		System.out.println("Date of birth     : "+dateofbirth.getDate());
		System.out.println("Mobile number     : "+mobilenumber);
	}
}