package arrays.java;

import java.util.Scanner;

public class Smallestlargestdiff {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int t=0;
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		int diff=a[n-1]-a[0];
		System.out.print(diff);
		sc.close();
	}
}
