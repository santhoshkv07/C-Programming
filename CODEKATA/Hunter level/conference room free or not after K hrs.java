package arrays.java;

import java.util.Scanner;

public class Meetinghrs {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		int count=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]<=k && (!(a[i]<0)))
			{
				count++;
			}
		}
		System.out.print(count);
		sc.close();
	}
}
