package arrays.java;

import java.util.Scanner;

public class Maxrepeatednum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int count=0,max=0,x=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			count=1;
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
				if(count>max)
				{
					x=a[i];
					max=count;
				}
			}
		}
		System.out.print(x);
		sc.close();
	}
}
