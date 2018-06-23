package javastrings.java;

import java.util.Scanner;

public class EveryKthcharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=s.length();
		int k=sc.nextInt();
		for(int i=-1+k;i<n;i+=k)
		{
			System.out.print(s.charAt(i)+" ");
		}
		/*int count=0;
		for(int i=0;i<n;i++)
		{
			count++;
			if(count%k==0)
			{
				System.out.print(s.charAt(i)+" ");
			}
		} */
		if(k>n)
		{
			System.out.print("not possible");
		}
		sc.close();
	}
}
