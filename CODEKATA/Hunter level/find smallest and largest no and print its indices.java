package sample;

import java.util.Scanner;

public class Smallestlargestindices {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n+1];
		int min=99,x=0,y=0,max=-999;
		for(int i=1;i<=n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=1;i<=n;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
				x=i;
			}
			if(a[i]>max)
			{
				max=a[i];
				y=i;
			}
		}
		System.out.print(x+" "+y);
		sc.close();
	}

}
