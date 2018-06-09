package arrays.java;

import java.util.Scanner;

public class Smallestlargestdiff {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int max=0,min=999,x=0,y=0,diff=0;
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
				x=i;
			}
			if(a[i]>max)
			{
				max=a[i];
				y=i;
			}
		}
		diff=y-x;
		System.out.print(diff);
		sc.close();
	}
}
