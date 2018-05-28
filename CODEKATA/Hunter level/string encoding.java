package javastrings.java;

import java.util.Scanner;

public class Stringencoding {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		int n=ch.length;
		int count=0;
		for(int i=0;i<n;i+=count)
		{
			count=1;
			for(int j=i+1;j<n;j++)
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
			if(count==1)
			{
				System.out.print(ch[i]);
			}
			else
			{
				System.out.print(count+"*"+ch[i]);
			}
		}
		sc.close();
	}
}
