package javastrings.java;

import java.util.Scanner;

public class Characterstoascii {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=s.length();
		int temp=0,sum=0;
		for(int i=0;i<n;i++)
		{
			temp=(int)(s.charAt(i));
			sum=sum+temp;
		}
		System.out.print(sum);
		sc.close();
	}

}
