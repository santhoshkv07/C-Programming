package javastrings.java;

import java.util.Scanner;

public class Camelcase {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=s.length();
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(s.charAt(i)>=57 && s.charAt(i)<=90)
			{
				count++;
			}
		}
		if(count!=0)
		{
			System.out.print("yes..it is in camel case");
		}
		else
		{
			System.out.print("no..it is not in camel case");

		}
		sc.close();

	}
}
