package javastrings.java;

import java.util.Scanner;

public class Characterchecking {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		int n=ch.length;
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(ch[i]=='a'||ch[i]=='b')
			{
				
			}
			else
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.print("yes..contains only a or b");
		}
		else if(count==1)
		{
			System.out.print("yes..only one character can be changed so that contains only a or b");
		}
		else
		{
			System.out.print("no..contains different characters");
		}
		sc.close();
	}
}
