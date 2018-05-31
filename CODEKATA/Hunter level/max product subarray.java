package arrays.java;

import java.util.Scanner;

public class Maxproductsubarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int prod=1,max=-999;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			prod=a[i];
			for(int j=i+1;j<n;j++)
			{
				prod=prod*a[j];
			}
			if(prod>max)
			{
				max=prod;
			}
		}
		System.out.print(max);
		sc.close();
	}
}
