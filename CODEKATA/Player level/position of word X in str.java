package javastrings.java;

import java.util.Scanner;

public class Wordposition 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] s1=s.split(" ");
		int n=s1.length;
		String x=sc.next();
		//String[] s2=str.split(" ");
		//int n1=str.length();
		int flag=0;
		for(int i=0;i<n;i++)
		{
			//boolean b=s1[i].equals(str);
			if(s1[i].equalsIgnoreCase(x))
			{
				System.out.print(i+1);
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.print("word not found");
		}
		sc.close();
	}
}
