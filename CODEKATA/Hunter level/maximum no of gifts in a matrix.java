package javastrings.java;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int sum=0,max=0;
		for(int i=0;i<n;i++)
		{
			max=0;
			for(int j=0;j<m;j++)
			{
				if(a[i][j]!=0)
				{
					if(a[i][j]>max)
					{
						max=a[i][j];
					}
				}
			}
			sum=sum+max;
		}
		System.out.print(sum);
		sc.close();
	}
}
