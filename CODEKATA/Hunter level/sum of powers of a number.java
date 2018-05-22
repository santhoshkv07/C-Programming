package sample;

import java.util.Scanner;

public class Sumofpowers {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		//String s=sc.next();
		//int n=s.length();
		//int x=0;
		//int res=0;
		int n=sc.nextInt();
		int a[]=new int[1000];
		int rem=0,sum=0,k=0,res=1;
		while(n!=0)
		{
			rem=n%10;
			a[k++]=rem;
			n=n/10;
		}
		for(int i=0;i<k;i++)
		{
			res=1;
			for(int j=i;j<k-1;j++)
			{
				res=res*a[i];
			}
			/*  if((k-1)==i)
			{
				res=1;
			}   */
			sum=sum+res;
		}
		System.out.print(sum);
		sc.close();
}
}
