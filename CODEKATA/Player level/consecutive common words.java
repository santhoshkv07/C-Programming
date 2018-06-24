package javastrings.java;

import java.util.Scanner;

public class Consecutivecommonstrings {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] s=new String[n];
		for(int i=0;i<n;i++)
		{
			s[i]=sc.next();
		}
		int count=1;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<2;j++)
			{
				if(s[j].compareTo(s[j+1])==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print("yes..common words present");
				break;
			}
			else
			{
				count=1;
			}
		}
		if(count==1)
		{
			System.out.print("no..common words absent");
		}
		sc.close();
	}
}
