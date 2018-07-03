package arrays.java;

import java.util.Scanner;

public class Maxsumwithoutneighbours 
{
	public static void main(String[] args) 
	{
		Scanner sc=new  Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int sum=0,sum1=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i+=2)
		{
			sum=sum+a[i];
		}
		for(int i=1;i<n;i+=2)
		{
			sum1=sum1+a[i];
		}
		if(sum>=sum1)
		{
			System.out.print(sum);
		}
		else
		{
			System.out.print(sum1);
		}
		sc.close();
	}
}
