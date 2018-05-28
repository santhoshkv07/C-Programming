package javastrings.java;

import java.util.Scanner;

public class Consecutivecharacterscount {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char[] ch=s.toCharArray();
		int count=0,max=-999;
		char x='+';
		for(int i=0;i<ch.length;i+=count+1)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
				}
				else
				{
					break;
				}
			}
			if(count>max)
			{
				max=count;
				x=ch[i];
			}
			if(count==0)
			{
				count++;
			}
		}
		System.out.print(x+" "+max);
		sc.close();
	}
}
