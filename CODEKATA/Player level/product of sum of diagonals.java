package matrix.java;

import java.util.Scanner;

public class Productofsumofdiagonals {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		int sum=0,prod=1;
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
				if(i==j)
				{
					sum=sum+a[i][j];
				}
			}
		}
		prod=prod*sum;
		sum=0;
		for(int i=0,j=n-1;i<=n-1 && j>=0;i++,j--)
		{
			sum=sum+a[i][j];
		}
		prod=prod*sum;
		System.out.print(prod);
		sc.close();
	}
}
