package practice;

import java.util.Scanner;

public class Fibbmethodrec {
	public static void main(String[] args) {
		System.out.println("enter how many fabb no.s you want");
		int number=new Scanner(System.in).nextInt();
		for(int i=1;i<=number;i++)
		{
			System.out.print(fabb2(i)+" ");
		}
		}
	public static int fabb(int number)
	{
		if(number==1||number==2)
		{
			return 1;
			}
	
		for(int i=3;i<=number;i++)
		{
			return fabb(number-1)+fabb(number-2);
			
		}
		return number;
		
		}
	
	public static int fabb2(int number)
	{
		if (number==1||number==2)
		{
			return 1;
			}
		int a=1,b=1,c=1;
		for (int i=3;i<=number;i++)
		{
		
		c=a+b;
	     a=b;
		b=c;
		}
		
		return c;
		
	}}
