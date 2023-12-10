// Write a Java Program to convert Number to Word
import java.util.Scanner;
public class NumberToWord
{
	public String pair(int n)
	{
		String word[]={"zero","one","two","three","four","five","six","seven","eight","nine","ten",
		"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
		String prefix[]={"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
		if(0<=n&&n<20)
		return word[n];
		return prefix[n/10-2]+" "+((n%10==0)?"":word[n%10]);
	}
	public String triple(int n,boolean zero)
	{
		if(n<100)
			return (pair(n).equals("zero")?(zero==true)?"zero":"":pair(n));
		return pair(n/100)+" hundred "+(pair(n%100).equals("zero")?"":"and "+pair(n%100));
	}
	public String convert(int n)
	{
		String postfix[]={"","thousand","lakh","crore","arab","kharab","nil","padma","shank"};
		int count=1,quotient;
		String word="";
		boolean zero=(n==0);
		do
		{
			quotient=(int)Math.pow(10,2+1*(int)(1.0/count));
			word=triple(n%quotient,zero)+" "+postfix[count-1]+" "+word;
			n=n/quotient;
			count++;
		}
		while(n!=0);
		return word;
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		NumberToWord number=new NumberToWord();
		System.out.println("Enter a number : ");
		int N=in.nextInt();
		String word=number.convert(N);
		System.out.println(N+" : "+word);
	}
}