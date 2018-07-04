package javastrings.java;

import java.util.Arrays;
import java.util.Scanner;

public class Anagramofastring {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s1="dhoni";
		String s2=sc.nextLine();
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		int n1=ch1.length;
		int n2=ch2.length;
		if(n1==n2)
		{
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if(Arrays.equals(ch1,ch2))
			{
				System.out.print("anagram");
			}
			else
			{
				System.out.print("not possible");
			}
		}
		else
		{
			System.out.print("not possible");
		}
		sc.close();
	}
}
