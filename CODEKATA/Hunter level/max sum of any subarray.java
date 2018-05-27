package arrays.java;

import java.util.Scanner;

public class Maxsubarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int sum=0,max=-999;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			sum=a[i];
			for(int j=i+1;j<n;j++)
			{
				sum=sum+a[j];
				if(sum>=max)
				{
					max=sum;
				}
			}
			sum=0;
		}
		System.out.print(max);
		sc.close();
	}
}
