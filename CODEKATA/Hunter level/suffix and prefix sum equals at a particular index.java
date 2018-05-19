package arrays.java;

import java.util.Scanner;

public class Prefixsuffixsum {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0,sum1=0,flag=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				sum=sum+a[j];
			}
			//System.out.print(sum);
			for(int k=i+1;k<n;k++)
			{
				sum1=sum1+a[k];
			}
			//System.out.print(sum1);
			if(sum==sum1)
			{
				flag=1;
				break;
			}
			else
			{
				sum=0;
				sum1=0;
			}
		}
		if(flag==1)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");	
		}
		sc.close();
	}
}
