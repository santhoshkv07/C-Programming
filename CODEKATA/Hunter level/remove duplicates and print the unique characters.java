package javastrings.java;

import java.util.Scanner;

public class Removeduplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int flag=0;
		char ch[]=s.toCharArray();
		String s1="";
		
		for(int i=0;i<ch.length;i++)
		{
			flag=0;
			if(ch[i]=='+')
			{
				continue;
			}
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					flag++;
					ch[j]='+';
				}
			}
			if(flag==0)
			{
				s1=s1+ch[i];
			}
		}
		System.out.print(s1);
		sc.close();
	}

}
