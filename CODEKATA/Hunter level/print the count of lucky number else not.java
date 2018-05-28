package arrays.java;

import java.util.Scanner;

public class Luckynumber {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int x=0,count=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			x=a[i]*i;
			for(int j=0;j<n;j++)
			{
				if(x==a[j])
				{
					count++;
					break;
				}
			}
		}
		System.out.print(count);
		sc.close();
	}
}
