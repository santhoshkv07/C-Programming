package sample;

import java.util.Scanner;

public class Sumofpowerofitsnextposition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem=0,res=1,sum=0,k=0;
		int a[]=new int[1000];
		while(n!=0)
		{
			rem=n%10;
			a[k++]=rem;
			n=n/10;
		}
		for(int i=0;i<k;i++)
		{
			sum=0;
			for(int j=1;j<=i+1;j++)
			{
				res=res*a[i];
			}
			sum=sum+res;
		}
		System.out.print(sum);
		sc.close();
	}
}
