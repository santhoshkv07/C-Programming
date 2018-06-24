package javastrings.java;

import java.util.Scanner;

public class Consecutivecommonstrings {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] s=new String[n];
		String t=null;
		for(int i=0;i<n;i++)
		{
			s[i]=sc.next();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(s[i].compareTo(s[j])>0)
				{
					t=s[i];
					s[i]=s[j];
					s[j]=t;
				}
				
			}
			//System.out.print(s[i]);
		}
		System.out.print(s[0]);
		sc.close();
	}
}
