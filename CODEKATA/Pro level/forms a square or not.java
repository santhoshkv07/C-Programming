package sample;

import java.util.Scanner;

public class Squarecheck
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[8];
		int t=0,count=0;;
		for(int i=0;i<8;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<4;i++)
		{
			for(int j=i+4;j<8;j++)
			{
				if(a[i]>a[j])
				{
					t=a[j];
					a[j]=a[i];
					a[i]=t;
				}
			}
		}
		for(int i=0;i<4;i++)
		{
			if(2*(a[i])==a[i+4])
			{
				count++;
			}
		}
		System.out.print(count==4?"yes..forms square":"no..not a square");
		sc.close();
	}
}

