package javastrings.java;

import java.util.Scanner;

public class Longestcommonsubsequence {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String str=sc.nextLine();
		char[] ch=s.toCharArray();
		char[] ch1=str.toCharArray();
		int n=ch.length;
		int n1=ch1.length;
		int x=0;
		String t="";
		if(n<n1)
		{
			for(int i=0;i<n;i++)
			{
				for(int j=x;j<n1;j++)
				{
					if(ch[i]==ch1[j])
					{
						t=t+ch[i];
						ch[i]='+';
						ch1[j]='+';
						x=j+1;
						break;
					}
				}
			}
		}
		else
		{
			for(int i=0;i<n1;i++)
			{
				for(int j=x;j<n;j++)
				{
					if(ch[j]==ch1[i])
					{
						t=t+ch1[i];
						ch[j]='+';
						ch1[i]='+';
						x=j+1;
						break;
					}
				}
			}
		}
		System.out.print(t);
		sc.close();
	}
}
