package sample;

import java.util.Scanner;

public class Coprime {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int count=0;
		if(a>b)
		{
			for(int i=2;i<=b;i++)
			{
				if((a%i==0)&&(b%i==0))
				{
					count=1;
					break;
				}
			}
		}
		else
		{
			for(int i=2;i<=a;i++)
			{
				if((a%i==0)&&(b%i==0))
				{
					count=1;
					break;
				}
			}
		}
		if(count==1)
		{
			System.out.print("no..not a prime");
		}
		else
		{
			System.out.print("yes..is a prime");
		}
		sc.close();

	}

}
