package javastrings.java;

import java.util.Scanner;

public class Descendingorderofvowelsinstrings 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] s=new String[n+1];
		String t="";
		int count[]=new int[n];
		int k=0,x=0;
		for(int i=0;i<=n;i++)
		{
		    s[i]=sc.nextLine();
		}
		for(int i=1;i<=n;i++)
		{
		    for(int j=0;j<s[i].length();j++)
		    {
		        if(s[i].charAt(j)=='a'|s[i].charAt(j)=='e'|s[i].charAt(j)=='i'|s[i].charAt(j)=='o'|s[i].charAt(j)=='u'|s[i].charAt(j)=='A'|s[i].charAt(j)=='E'|s[i].charAt(j)=='I'|s[i].charAt(j)=='O'|s[i].charAt(j)=='U')
		        {
		            x++;
		        }
		    }
		    count[k++]=x;
		    //System.out.print(count[k]+" "+x+"        ");
		    x=0;
		}
		for(int i=0;i<k;i++)
		{
		    for(int j=i+1;j<k;j++)
		    {
		        if(count[i]<count[j])
		        {
		            t=s[i+1];
		            s[i+1]=s[j+1];
		            s[j+1]=t;
		        }
		    }
		    System.out.print(s[i+1]);
		    System.out.printf("\n");
		}
		sc.close();
	}
}
