package javastrings.java;

import java.util.Scanner;

public class Reverseorderofstr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		int n=ch.length;
		String s1="";
		int count=0;
		for(int i=n-1;i>=0;i--)
		{
			count=0;
			if(ch[i]=='+')
			{
				continue;
			}
			for(int j=i-1;j>=0;j--)
			{
				if(ch[i]==ch[j])
				{
					ch[j]='+';
					count++;
				}
			}
			if(ch[i]!='+' || count==0)
			{
				s1=s1+ch[i];
			}
		}
		System.out.print(s1);
		sc.close();
	}
}
