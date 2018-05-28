package arrays.java;

import java.util.Scanner;

public class Arrayrotation {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();
		int a[]=new int[n];
		int temp=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<d;i++)
		{
			temp=a[0];
			for(int j=0;j<n-1;j++)
			{
				a[j]=a[j+1];
			}
			a[n-1]=temp;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		sc.close();
	}
}
