package javastrings.java;

import java.util.Scanner;

public class Encodedstring
{
	static String decode(String s)
	{
		int n=0;
		for(int i=1;i<s.length();i+=2)
		{
			//int count=Character.getNumericValue(s.charAt(i));
			//int count=Integer.parseInt(Character.toString(s.charAt(i)));
			int count=Integer.parseInt(String.valueOf(s.charAt(i)));
			n=n+count;
		}
		char[] ch=new char[n];
		int k=0;
		for(int i=1;i<s.length();i+=2)
		{
			//int count=Character.getNumericValue(s.charAt(i));
			//int count=Integer.parseInt(Character.toString(s.charAt(i)));
			int count=Integer.parseInt(String.valueOf(s.charAt(i)));
			for(int j=1;j<=count;j++)
			{
				ch[k++]=s.charAt(i-1);
			}
		}
		return String.valueOf(ch);
	}

	static String encode(String s1)
	{
		int count=1;
		String str="";
		for(int i=0;i<s1.length();i+=count)
		{
			count=1;
			for(int j=i+1;j<s1.length();j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					count++;
				}
			}
			str=str+s1.charAt(i)+count;
		}
		return str;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();            //a3b1
		String s1=decode(s);      	       //aaab
		if(s.length()%2==0)
		{
			System.out.println(s1);
		}
		else
		{
			s1=s1+s.charAt(s.length()-1);
			System.out.println(s1);
		}
		String s2=encode(s1);		            //a3b1
		System.out.print(s2);
		sc.close();
	}
}
