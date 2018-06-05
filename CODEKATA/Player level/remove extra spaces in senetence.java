package javastrings.java;

import java.util.Scanner;

public class Stringtrim {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String str=s.replaceAll("\\s+"," ").trim();
		System.out.print(str);
		sc.close();
	}
}
