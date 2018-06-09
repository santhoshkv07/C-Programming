package arrays.java;

import java.util.Scanner;

public class Alternateincreasedecrease {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int flag=1;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		if(a[0]<a[1])
		{
			for(int i=0;i<n-1;i++)
			{
				if(i%2==0)
				{
					if(a[i]<a[i+1])
					{
						flag=1;
					}
					else
					{
						flag=0;
						break;
					}
				}
				else
				{
					if(a[i]>a[i+1])
					{
						flag=1;
					}
					else
					{
						flag=0;
						break;
					}
				}
			}
		}
		else
		{
			for(int i=0;i<n-1;i++)
			{
				if(i%2!=0)
				{
					if(a[i]<a[i+1])
					{
						flag=1;
					}
					else
					{
						flag=0;
						break;
					}
				}
				else
				{
					if(a[i]>a[i+1])
					{
						flag=1;
					}
					else
					{
						flag=0;
						break;
					}
				}
			}
		}
		if(flag==0)
		{
			System.out.print("no..not in increasing decreasing order");
		}
		else
		{
			System.out.print("yes..it's in increasing decreasing order");
		}
		sc.close();
	}
}
