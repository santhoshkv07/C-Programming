package arrays.java;

import java.util.Scanner;

public class Primesumendswith3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0,rem=0,count=0;
		for(int i=1;i<=n;i++)
		{
			count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				rem=i%10;
				if(rem==3)
				{
					sum=sum+i;
				}
			}
		}
		System.out.print(sum);
		sc.close();
	}

}
