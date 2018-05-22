package arrays.java;

import java.util.Scanner;

public class Noofpairs {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int count=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]<a[j])
				{
					count++;
					//System.out.print(a[i]+""+a[j]+" ");
				}
			}
		}
		System.out.print(count+" "+"pairs are present in the array with pairs forming format");
		sc.close();

	}

}
