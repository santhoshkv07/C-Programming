package javastrings.java;

import java.util.Scanner;

public class Substringcontains {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s1="Vishal";
		String s2="Sundar";
		String s=sc.nextLine();
		boolean res=s.contains(s1);
		boolean res1=s.contains(s2);
		//int result=s.lastIndexOf(s2,10);
		if(res==true && res1==true)
		{
			System.out.print("yes..string contains both the s1 and s2 strings");
		}
		else
		{
			System.out.print("no..string doesnot contains both the s1 and s2 strings");
		}
		//System.out.print(result);
		sc.close();
	}
}
