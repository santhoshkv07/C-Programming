package arrays.java;

import java.util.Scanner;

public class Mirrorimageinarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int count=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		for(int i=0,j=n-1;i<n && j>=0;i++,j--)
		{
			if(a[i]==b[j])
			{
				count++;
			}
		}
		if(count==n)
		{
			System.out.print("yes..mirror image of each other");
		}
		else
		{
			System.out.print("not..mirror image of each other");
		}
		sc.close();
	}
}
