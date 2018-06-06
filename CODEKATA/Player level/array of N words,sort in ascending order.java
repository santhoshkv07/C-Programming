package javastrings.java;

import java.util.Scanner;

public class Sortarrayofwords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] s=new String[n];
		int[] sum=new int[n];
		int k=0;
		String temp="";
		for(int i=0;i<n;i++)
		{
			s[i]=sc.next();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<s[i].length();j++)
			{
				sum[k]=sum[k]+(int)s[i].charAt(j);
			}
			k++;
			//System.out.print(sum[i]+" ");
		}
		for(int i=0;i<k;i++)
		{
			for(int j=i+1;j<k;j++)
			{
				if(sum[i]>sum[j])
				{
					temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
			System.out.print(s[i]+" ");
		}   
		sc.close();
	}
}
