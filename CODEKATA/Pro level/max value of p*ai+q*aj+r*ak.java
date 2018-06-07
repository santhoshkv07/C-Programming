package arrays.java;

import java.util.Scanner;

public class Maxvalueofarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int p=sc.nextInt();
		int q=sc.nextInt();
		int r=sc.nextInt();
		int a[]=new int[n];
		int sum=0,pro1=0,pro2=0,pro3=0,max=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			pro1=p*a[i];
			for(int j=0;j<n;j++)
			{
				pro2=q*a[j];
				for(int k=0;k<n;k++)
				{
					pro3=r*a[k];
					sum=pro1+pro2+pro3;
					if(sum>max)
					{
						max=sum;
					}
				}
			}
		}
		if(sum>max)
		{
			System.out.print(sum);
		}
		else
		{
			System.out.print(max);
		}
		sc.close();
	}
}
