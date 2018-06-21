package javastrings.java;

import java.util.Scanner;

public class Atleastonevowel {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=Integer.parseInt(s);
		String[] str=new String[n];
		for(int i=0;i<n;i++)
		{  
			str[i]=sc.nextLine();
		}
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<str[i].length();j++)
			{
				if(str[i].charAt(j)=='a'||str[i].charAt(j)=='e'||str[i].charAt(j)=='i'||str[i].charAt(j)=='o'||str[i].charAt(j)=='u')
				{
					count++;
					break;
				}
			}
		}
		if(count==n)
		{
			System.out.print("yes..contains atleast one vowels in all strings");
		}
		else
		{
			System.out.print("no..does not contain atleast one vowels in all strings");
		}
		sc.close();
	}
}
