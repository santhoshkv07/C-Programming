package javastrings.java;

import java.util.Arrays;
import java.util.Scanner;
public class Substringand 
{	
	static void fun(String s)
	{
		String[] str=s.split(" ");
		String temp="";
		for(int i=0;i<str.length;i++)
		{
			if(str[0].contains("and")|| str[str.length-1].contains("and"))
			{
				continue;
			}
			else if(str[i].contains("and"))
			{
				temp=str[i+1];
				str[i+1]=str[i-1];
				str[i-1]=temp;
			}
		}
		String str1=Arrays.toString(str).replace(",","").replace("[","").replace("]","").trim();
		System.out.print(str1);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		//int n=s.length();
		fun(s);
		sc.close();
	}
}
//jack and jill went up and down the hill
