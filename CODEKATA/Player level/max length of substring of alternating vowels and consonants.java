package javastrings.java;

import java.util.Scanner;

public class Vowelconsonant
{
	public static int maxlength(char[] ch,int n)
	{
		int count=1,max=-1;
		if(Character.isAlphabetic(ch[0]))
		{
			for(int i=0,j=i+1;i<n && j<n;i++,j++)
			{
				if(ch[i]=='a'|ch[i]=='e'|ch[i]=='i'|ch[i]=='o'|ch[i]=='u')
				{
					if(!(ch[j]=='a'|ch[j]=='e'|ch[j]=='i'|ch[j]=='o'|ch[j]=='u'))
					{
						count++;
						//System.out.println(count);
					}
					else
					{
						if(count>=max)
						{
							max=count;
							count=1;
						}
					}
				}
				else if(!(ch[i]=='a'|ch[i]=='e'|ch[i]=='i'|ch[i]=='o'|ch[i]=='u'))
				{
					if(ch[j]=='a'|ch[j]=='e'|ch[j]=='i'|ch[j]=='o'|ch[j]=='u')
					{
						count++;
						//System.out.println(count);
					}
					else
					{
						if(count>=max)
						{
							max=count;
							count=1;
						}
					}
				}
			}
			if(count>=max && count!=1)
			{
				max=count;
			}
		}
		else
		{
			System.out.print("not possible");
		}
		return max;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		int n=ch.length;
		int len=maxlength(ch,n);
		if(len==1)
		{
			System.out.print(len-1);
		}
		else
		{
			System.out.print(len);
		}
		sc.close();
	}
}
