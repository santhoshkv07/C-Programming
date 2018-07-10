package sample;

import java.util.Scanner;

public class Sumofdigits {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] a=s.toCharArray();
		int n=a.length;
		int res=0,sum=0;
		for(int i=0;i<n;i++)
		{
			res=0;
			for(int j=0;j<=i;j++)
			{
				res=res+(int)a[j]-48;
			}
			sum=sum+res;
		}
		System.out.print(sum);
		sc.close();
	}
}
