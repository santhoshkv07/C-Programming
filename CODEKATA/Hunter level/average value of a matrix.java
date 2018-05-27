package matrix.java;

import java.util.Scanner;

public class Averagevalueofmatrix {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		float avg;
		int sum=0,count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				sum=sum+a[i][j];
				count++;
			}
		}
		System.out.println(sum);
		avg=(float)sum/count;
		System.out.printf("%.6f",avg);
		sc.close();
	}
}
