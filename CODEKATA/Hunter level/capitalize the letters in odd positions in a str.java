package javastrings.java;

import java.util.Scanner;

public class Reverseeachwordinstr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] str=s.split("\\s");
		String s1="";
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<str[i].length();j++)
			{
				if(j%2==0)
				{
					s1=s1+String.valueOf(Character.toUpperCase(str[i].charAt(j)));		
				}
				else
				{
					s1=s1+String.valueOf(str[i].charAt(j));
				}
			}
			s1=s1+" ";
		}
		System.out.print(s1);
		sc.close();
	}
}
