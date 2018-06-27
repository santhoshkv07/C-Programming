package sample;

import java.util.Scanner;

public class Sumofdigitsispalindrome {

	public static int sum(int n)
	{
		int sum=0,rem=0;
		if(n<0)
		{
			return 0;
		}
		else if(n>=0 && n<=9)
		{
			return 1;
		}
		else
		{
			while(n!=0)
			{
				rem=n%10;
				sum=sum+rem;
				n/=10;
			}
			if(sum>=0 && sum<=9)
			{
				return 1;
			}
			else
			{
				return palindrome(sum);
			}
		}
	}
	public static int palindrome(int n)
	{
		String s=Integer.toString(n);
		StringBuffer sb=new StringBuffer(s);
		String str=sb.reverse().toString();
		if(s.equals(str))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res=sum(n);
		if(res==0)
		{
			System.out.print(n+"is not a palindrome");
		}
		else
		{
			System.out.print(n+"is a palindrome");
		}
		sc.close();
	}
}
