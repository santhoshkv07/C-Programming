package javastrings.java;

import java.util.Scanner;

public class Reverseeachwordinstr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] str=s.split("\\s");
		for(int i=0;i<str.length;i++)
		{
			for(int j=str[i].length()-1;j>=0;j--)
			{
				System.out.print(str[i].charAt(j));
			}
			System.out.print(" ");
		}
		sc.close();
	}
}
