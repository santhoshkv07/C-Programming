package arrays.java;

import java.util.Scanner;

public class Leastnooftimesofanuminarray {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int min=99,count=0,x=0;
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			count=1;
			if(a[i]=='+')
			{
				continue;
			}
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					a[j]='+';
				}
			}
			if(count<min)
			{
				min=count;
				x=a[i];
			}
		}
		System.out.print(x);
		sc.close();
	}
}
