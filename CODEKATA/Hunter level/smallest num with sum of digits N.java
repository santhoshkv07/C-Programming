package sample;

import java.util.Scanner;

public class Smallestnumwithsumofdigits {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0,rem=0;
		for(int i=1;i<=100000000;i++)
		{
			if(i==n && i<=9)
			{
				System.out.print(i);
				break;
			}
			else if(i>9 && i!=n)
			{
				int n1=i;
				sum=0;
				while(n1!=0)
				{
					rem=n1%10;
					sum=sum+rem;
					n1=n1/10;
				}
				if(sum==n)
				{
					System.out.print(i);
					break;
				}
			}
			else
			{
				continue;
			}
		}
		sc.close();
	}
}
