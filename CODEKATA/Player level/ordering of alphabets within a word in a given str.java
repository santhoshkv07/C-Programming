package javastrings.java;

import java.util.Arrays;
import java.util.Scanner;

public class Reverseeachwordinalphabeticorder {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] str=s.split("\\s");
		int n=str.length;
		char temp=' ';
		String s3="";
		for(int i=0;i<n;i++)
		{
			char[] ch=str[i].toCharArray();
			for(int j=0;j<ch.length;j++)
			{
				for(int k=j+1;k<ch.length;k++)
				{
					if(ch[j]>ch[k])
					{
						temp=ch[j];
						ch[j]=ch[k];
						ch[k]=temp;
					}
				}
				//System.out.print(ch[j]);
			}
			//String str1=String.valueOf(ch); OR
			//String str1=Arrays.toString(ch).replace(",","").replace("[","").replace("]","").replace(" ","");
			//System.out.print(str1+" ");
			String str1=String.valueOf(ch);
			s3=s3+str1+" ";
		}
		System.out.print(s3);
		sc.close();
	}
}
