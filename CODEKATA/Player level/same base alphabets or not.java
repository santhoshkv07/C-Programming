package javastrings.java;

import java.util.Scanner;

public class Samebasealphabets {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		char[] ch1=s1.toCharArray();
		String s2=sc.nextLine();
		char[] ch2=s2.toCharArray();
		int n1=ch1.length;
		int n2=ch2.length;
		int flag=0,count=0,count1=0;
		for(int i=0;i<n1;i++)
		{
			flag=0;
			if(ch1[i]=='+')
			{
				continue;
			}
			for(int j=i+1;j<n1;j++)
			{
				if(ch1[i]==ch1[j])
				{
					flag=1;
					ch1[j]='+';
				}
			}
			if(flag==0 || (flag==1 && ch1[i]!='+'))
			{
				count++;
			}
		}
		for(int i=0;i<n2;i++)
		{
			flag=0;
			if(ch2[i]=='+')
			{
				continue;
			}
			for(int j=i+1;j<n2;j++)
			{
				if(ch2[i]==ch2[j])
				{
					flag=1;
					ch2[j]='+';
				}
			}
			if(flag==0 || (flag==1 && ch2[i]!='+'))
			{
				count1++;
			}
		}
		if(count==count1)
		{
			System.out.print("true..same base alphabets");
		}
		else
		{
			System.out.print("false..no same base alphabets");
		}
		sc.close();
	}
}
