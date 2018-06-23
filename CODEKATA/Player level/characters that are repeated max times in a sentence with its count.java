package javastrings.java;

import java.util.Scanner;

public class Maxrepeatedcharacterswithcount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		int n=ch.length;
		String str="";
		int x=1,max=1;
		for(int i=0;i<ch.length;i++)
		{
			x=1;
			if(ch[i]=='+')
			{
				continue;
			}
			for(int j=i+1;j<n;j++)
			{
				if(ch[i]==ch[j] && ch[i]!=' ' && ch[j]!=' ')
				{
					x++;
					ch[j]='+';
				}
			}
			if(x==1)
			{
				ch[i]='+';
			}
			if(x>max && str=="" || x==max && str!="")
			{
				max=x;
				str=str+String.valueOf(ch[i]);
				//System.out.print(str+" ");
			}
			else if(x>max && str!="")
			{
				str="";
				max=x;
				str=str+String.valueOf(ch[i]);
				//System.out.print(str);
			}
		}
		System.out.print(max+" ");
		System.out.print(str);
		sc.close();
	}
}
