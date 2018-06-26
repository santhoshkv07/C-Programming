package javastrings.java;

import java.util.Scanner;

public class StringcontainsuptoKnumbers {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char[] ch=s.toCharArray();
		int n=ch.length;
		int k=sc.nextInt();
		int count=0;
		for(int i=0;i<=k;i++)
		{
			for(int j=0;j<n;j++)
			{	
				if(ch[j]=='+')
				{
					continue;
				}
				if(i==(Integer.parseInt(String.valueOf(ch[j]))))
				{
					count++;
					ch[j]='+';
					//System.out.print(count+" "+i+" ");
					break;
				}
			}
		}
		if(count-1==k)
		{
			System.out.print("yes..contains from 0 to "+k);
		}
		else
		{
			System.out.print("no..doesnot contains from 0 to "+k);
		}
		sc.close();
	}
}
