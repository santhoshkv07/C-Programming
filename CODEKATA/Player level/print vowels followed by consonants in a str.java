package javastrings.java;

import java.util.Scanner;

public class Vowelsconsonants {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				System.out.print(ch[i]);
				ch[i]='+';
			}
		}
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!='+')
			{
				System.out.print(ch[i]);
			}
		}
		sc.close();
	}
}
