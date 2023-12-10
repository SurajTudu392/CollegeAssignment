/*Q5.To implement class and object creation by developing a java programme for generating Electricity bill.
Generate Electricity bill by creating a class with the following members: Consumer no., consumer name, previous month reading, current month reading, type of EB connection(i.e domestic or commercial) and compute the bill amount using the following tariff.
If the type of the EB connection is domestic, calculate the amount to be paid as follows: First 100 units - Rs. 1 per unit
101-200 units - Rs. 2.50 per unit 201 -500 units - Rs. 4 per unit
>	501 units    - Rs. 6 per unit
If the type of the EB connection is commercial, calculate the amount to be paid as follows: First 100 units - Rs. 2 per unit
101-200 units - Rs. 4.50 per unit 201 -500 units - Rs. 6 per unit
>	501 units    - Rs. 7 per unit
*/


import java.util.*;
import java.io.*;

public class ElectricConnection
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader input=new InputStreamReader(System.in);
		BufferedReader read=new BufferedReader(input);
		Scanner in=new Scanner(System.in);
		System.out.println("----------------- ELECTRICITY BILL -----------------");
		System.out.print("Enter Consumer Number : ");
		int CN=in.nextInt();
		System.out.print("Enter Consumer Name : ");
		String N=read.readLine();
		System.out.print("Enter Prevoius Month Reading : ");
		int PMR=in.nextInt();
		System.out.print("Enter Current Month Reading : ");
		int CMR=in.nextInt();
		System.out.print("Enter Connection Type : ");
		String CT=read.readLine();
		ElectricityBill EC=new ElectricityBill(CN,N,PMR,CMR,CT);
		System.out.println(EC);
		
		System.out.println("\n\n");
		
		System.out.println("----------------- ELECTRICITY BILL -----------------");
		System.out.print("Enter Consumer Number : ");
		CN=in.nextInt();
		System.out.print("Enter Consumer Name : ");
		N=read.readLine();
		System.out.print("Enter Current Month Reading : ");
		CMR=in.nextInt();
		System.out.print("Enter Connection Type : ");
		CT=read.readLine();
		EC.setConsumerNumber(CN);
		EC.setConsumerName(N);
		EC.setCurrentMonthReading(CMR);
		EC.setConnectionType(CT);
		System.out.println(EC);
	}
}

public class ElectricityBill
{
	int consumer_number,previous_month_reading,current_month_reading;
	double Bill=0.0;
	String consumer_name,connection_type;
	public ElectricityBill()
	{
		consumer_number=0;
		consumer_name="Unknown";
		previous_month_reading=0;
		current_month_reading=0;
		connection_type="Domestic";
	}
	public ElectricityBill(int consumer_number,String consumer_name,int previous_month_reading,int current_month_reading,String connection_type)
	{
		this.consumer_number=consumer_number;
		this.consumer_name=consumer_name;
		this.previous_month_reading=previous_month_reading;
		this.current_month_reading=current_month_reading;
		this.connection_type=connection_type;
	}
	public void setConsumerNumber(int consumer_number){this.consumer_number=consumer_number;}
	public void setConsumerName(String consumer_name){this.consumer_name=consumer_name;}
	//public void setPreviousMonthReading(int previous_month_reading){this.previous_month_reading=previous_month_reading;}
	public void setCurrentMonthReading(int current_month_reading)
	{
		this.previous_month_reading=this.current_month_reading;
		System.out.println("Prev : "+this.current_month_reading);
		this.current_month_reading=current_month_reading;
	}
	public void setConnectionType(String connection_type){this.connection_type=connection_type;}
	
	public int getConsumerNumber(){return consumer_number;}
	public String getConsumerName(){return consumer_name;}
	public int getPreviousMonthReading(){return previous_month_reading;}
	public int getCurrentMonthReading(){return current_month_reading;}
	public String getConnectionType(){return connection_type;}
	
	public double getBill()
	{
		Bill=0.0;
		int CMR=current_month_reading;
		switch(connection_type)
		{
			case "Domestic":
				Bill=Bill+1*((current_month_reading-100>0)?100:current_month_reading);
				current_month_reading=((current_month_reading-100)<=0)?0:current_month_reading-100;
				Bill=Bill+2.5*((current_month_reading-100>0)?100:current_month_reading);
				current_month_reading=((current_month_reading-100)<=0)?0:current_month_reading-100;
				Bill=Bill+4.0*((current_month_reading-300>0)?300:current_month_reading);
				current_month_reading=((current_month_reading-300)<=0)?0:current_month_reading-300;
				Bill=Bill+6.0*current_month_reading;
			break;
			case "Commercial":
				Bill=Bill+2*((current_month_reading-100>0)?100:current_month_reading);
				current_month_reading=((current_month_reading-100)<=0)?0:current_month_reading-100;
				Bill=Bill+4.5*((current_month_reading-100>0)?100:current_month_reading);
				current_month_reading=((current_month_reading-100)<=0)?0:current_month_reading-100;
				Bill=Bill+6.0*((current_month_reading-300>0)?300:current_month_reading);
				current_month_reading=((current_month_reading-300)<=0)?0:current_month_reading-300;
				Bill=Bill+7.0*current_month_reading;
			break;
			default:
				System.out.println(connection_type+" : No such type of connection is found .");
		}
		current_month_reading=CMR;
		return Bill;
	}
	public String toString()
	{
		return 
		"Consumer Number        : "+consumer_number+"\n"+
		"Consumer Name          : "+consumer_name+"\n"+
		"Previous Month Reading : "+previous_month_reading+"\n"+
		"Current Month Reading  : "+current_month_reading+"\n"+
		"Connection Type        : "+connection_type+"\n"+
		"Electricity Bill       : "+getBill()+"\n";
	}
}