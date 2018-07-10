package javastrings.java;

import java.util.Scanner;

public class Passwordgenerator {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String str=sc.nextLine();
		int diff=0;
		if(s.length()<str.length())
		{
			diff=str.length()-s.length();
			for(int i=1;i<=diff;i++)
			{
				s=s+i;
			}
		}
		else if(s.length()>str.length())
		{
			diff=s.length()-str.length();
			for(int i=1;i<=diff;i++)
			{
				str=str+i;
			}
		}
		String x="";
		char[] ch1=s.toCharArray();
		char[] ch2=str.toCharArray();
		int n1=ch1.length;
		for(int i=0,j=0;i<n1 && j<n1;i++,j++)
		{
			x=x+ch1[i]+ch2[j];
		}
		System.out.print(x);
		sc.close();
	}
}
