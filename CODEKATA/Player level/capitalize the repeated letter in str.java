package javastrings.java;

import java.util.Scanner;

public class Capitalizecommonletters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		int n=ch.length;
		int flag=0;
		for(int i=0;i<n;i++)
		{
			flag=0;
			for(int j=i+1;j<n;j++)
			{
				if(ch[i]==ch[j])
				{
					flag++;
					ch[j]=Character.toUpperCase(ch[j]);
				}
			}
			if(flag!=0)
			{
				ch[i]=Character.toUpperCase(ch[i]);
			}
		}
		String str=String.valueOf(ch);
		System.out.print(str);
		sc.close();
		}
}
