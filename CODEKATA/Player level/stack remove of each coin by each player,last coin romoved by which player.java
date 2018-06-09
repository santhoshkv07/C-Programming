package sample;

import java.util.Scanner;

public class Stackmove {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		for(int i=n,j=1;i>=0 && j<=x+1;i--,j++)
		{
			if(i!=1 && j==x+1)
			{
				j=1;
			}
			if(i==1 && j!=x+1)
			{
				x=j;
			}
			if(i==1 && j==x+1)
			{
				x=j=1;
			}
		}
		System.out.print(x);
		sc.close();
	}
}
