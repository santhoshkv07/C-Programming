package sample;

import java.util.Scanner;

public class Sumof3primes {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int flag=0;
		for(int i=1;i<n;i++)
		{
			count=0;
			for(int j=i;j<n;j++)
			{
				count=0;
				for(int k=j;k<n;k++)
				{
				count=0;
				if(i+j+k==n)
				{
					for(int l=1;l<=i;l++)
					{
						if(i%l==0)
						{
							count++;
						}
					}
					if(count==2 || i==1 && count==1)
					{
						count=0;
						for(int m=1;m<=j;m++)
						{
							if(j%m==0)
							{
								count++;
							}
						}
					}
					if(count==2 || j==1 && count==1)
					{
						count=0;
						for(int p=1;p<=k;p++)
						{
							if(k%p==0)
							{
								count++;
							}
						}
					}
					if(count==2 || k==1 && count==1)
					{
						flag++;
						System.out.print(i+" "+j+" "+k+" ");
						System.out.println();
					}
				}
				}
			}
		}
		System.out.print(flag);
		sc.close();
	}
}
