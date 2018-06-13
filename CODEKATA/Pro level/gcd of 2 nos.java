package sample;

import java.util.Scanner;

public class Gcdofnos {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int q=sc.nextInt();
		int l[]=new int[q];
		int r[]=new int[q];
		int gcd=1;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<q;i++)
		{
			l[i]=sc.nextInt();
			r[i]=sc.nextInt();
		}
		for(int i=0;i<q;i++)
		{
			for(int j=1;j<=l[i] && j<=r[i];j++)
			{
				if(l[i]%j==0 && r[i]%j==0)
				{
					gcd=j;
				}
			}
			System.out.print(gcd);
			System.out.println();
		}
		sc.close();
	}
}
