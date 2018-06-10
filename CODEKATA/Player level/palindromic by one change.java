package javastrings.java;

import java.util.Scanner;

public class Palindromicbyonechange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=s.length();
		int flag=0,count=0;
		//System.out.print(s.charAt(n/2));
		for(int i=0,j=n-1;i<n/2 && j>=n/2;i++,j--)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				count++;
			}
			else
			{
				flag++;
			}
		}
		//System.out.print(count);
		if(flag==1)
		{
			System.out.print("yes..palindrome");
		}
		else if(count==n/2)
		{
			System.out.print("yes..palindrome");
		}
		else
		{
			System.out.print("no..palindrome");
		}
		sc.close();
	}
}
