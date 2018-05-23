package sample;

import java.util.Scanner;

public class Sumfdigitsasprime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int count=0,rem=0,sum=0,n,flag=0;
		for(int i=n1;i<=n2;i++)
		{
			count=0;
			sum=0;
			n=i;
			while(n!=0)
			{
				rem=n%10;
				sum=sum+rem;
				n=n/10;
			}
			for(int j=2;j<=(sum/2);j++) 
			{
				if(sum%j==0)
				{
					count++;
				}
			}
			if(count==0 && sum!=1)
			{
				//System.out.print(sum+" ");
				flag++;
			}
		}
		System.out.print(flag);
		sc.close();
	}

}
