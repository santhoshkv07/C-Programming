package sample;

import java.util.Scanner;

public class Complementary {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		char[] temp= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		String s3=s1.concat(s2);
		char[] ch=s3.toCharArray();
		int flag=0;
		if(ch.length==temp.length)
		{
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]>='A' && ch[i]<='Z')
				{
					flag=1;
				}
				else
				{
					flag=0;
					break;
				}
			}
			if(flag!=1)
			{
				System.out.print("not complementary");
			}
			else
			{
				System.out.print("complementary");
			}
		}
		else
		{
			System.out.print("not complementary");
		}
		sc.close();
	}
}
