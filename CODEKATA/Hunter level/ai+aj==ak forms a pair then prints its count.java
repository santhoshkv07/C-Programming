package arrays.java;

import java.util.Scanner;

public class Noofpairs {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int x=0,count=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<=n-3;i++)
		{
			for(int j=i+1;j<=n-2;j++)
			{
				x=a[i]+a[j];
				for(int k=j+1;k<=n-1;k++)
				{
					if(x==a[k])
					{
						count++;
						System.out.print(a[i]+""+a[j]+" ");
						break;
					}
				}
			}
		}
		System.out.print(count+" "+"pairs are present in the array with ai+aj=ak format");
		sc.close();

	}

}
