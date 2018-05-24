package sample;

import java.util.Scanner;

public class Sumofpowerfordigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0,res=1,sum=0,rem=0,temp=0;
		temp=n;
		while(n!=0)
		{
			rem=n%10;
			count++;
			n=n/10;
		}
		//System.out.print(count);
		n=temp;
		while(n!=0)
		{
			res=1;
			int rem1=n%10;
			for(int i=1;i<=count;i++)
			{
				res=res*rem1;
			}
			sum=sum+res;
			n=n/10;
		}
		System.out.print(sum);
		sc.close();
	}
}
