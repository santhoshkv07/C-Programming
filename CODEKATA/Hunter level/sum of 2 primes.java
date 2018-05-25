package sample;

import java.util.Scanner;

public class Sumofprimes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int flag=0;
		for(int i=1;i<n;i++)
		{
			count=0;
			for(int j=i;j<n;j++)
			{
				if(i+j==n)
				{
					for(int k=1;k<=i;k++)
					{
						if(i%k==0)
						{
							count++;
						}
					}
					if(count==2 || i==1 && count==1)
					{
						count=0;
						for(int l=1;l<=j;l++)
						{
							if(j%l==0)
							{
								count++;
							}
						}
					}
					if(count==2 || j==1 && count==1)
					{
						flag++;
						System.out.print(i+" "+j+" ");
						System.out.println();
					}
				}
			}
		}
		System.out.print(flag);
		sc.close();
	}
}
