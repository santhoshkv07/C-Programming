package day9.java;

import java.util.Scanner;

public class Currency 
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	char[] ch= {1000,500,100,50,10,1};
	int num=sc.nextInt();
	int count=0;
	while(num!=0)
	{
		for(int i=0;i<ch.length;i++)
		{
			if(num>=ch[i])
			{
				num=num-ch[i];
				count++;
				break;
			}
		}
	}
	System.out.print(count);
	sc.close();
	}
}
