package javastrings.java;

import java.util.Scanner;

public class Longestcommonprefixx
{
	public static int longestprefix(String s1,String s2,int l)
	{
		int i=0;
		for(i=0;i<l && i<s2.length();i++)
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{
				break;
			}
		}
		return i;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		String[] str=new String[len];
		str[0]=sc.next();
		int l=str[0].length();
		String x="";
		for(int i=1;i<len;i++)
		{
			str[i]=sc.next();
			l=longestprefix(str[0],str[i],l);
		}
		if(l>0)
		{
			for(int i=0;i<l;i++)
			{
				x=x+str[0].charAt(i);
			}
			System.out.print(x);
		}
		else
		{
			System.out.print("no elements common");
		}
    	sc.close();
	}
}
