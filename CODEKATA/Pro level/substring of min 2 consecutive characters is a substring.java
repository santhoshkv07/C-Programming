package javastrings.java;

import java.util.Scanner;

public class Substringpartofanotherstr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		char[] ch1=s1.toCharArray();
		int n1=ch1.length;
		//char[] ch2=s2.toCharArray();
		String x="";
		int flag=0;
		for(int i=0;i<n1-1;i++)
		{
			x=x+ch1[i]+ch1[i+1];
			//System.out.println(x);
			if(s2.contains(x))
			{
				System.out.print(x+" is the substring");
				flag=1;
				break;
			}
			x="";
		}
		if(flag==0)
		{
			System.out.print("there is no substring");
		}
		sc.close();
	}
}
