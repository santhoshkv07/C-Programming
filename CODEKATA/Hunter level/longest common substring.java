package javastrings.java;

import java.util.Scanner;

public class Longestcommonsubstring {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String str=sc.nextLine();
		char[] ch=s.toCharArray();
		char[] ch1=str.toCharArray();
		int n=ch.length;
		int n1=ch1.length;
		/*int a[][]=new int[n1][n];
		int b[]=new int[n];
		int max=0,k=0;
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(str.charAt(i)==s.charAt(j))
				{
					a[i][j]=a[i-1][j-1]+1;
				}
				else
				{
					a[i][j]=0;
				}
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
			}
		}
		int count=0;
		for(int i=n1-1;i>=0;i--)
		{
			for(int j=n-1;j>=0;j--)
			{
				if(a[i][j]==max && max!=0)
				{
					System.out.print(b[k]+" ");
					count++;
					max--;
					break;
				}
				/*else if(count!=0 && a[i][j]!=0)
				{
					b[k++]=a[i-1][j-1];
					break;
				}
				else if(a[i][j]==0 || count==0)
				{
					continue;
				}   */
				//https://karussell.wordpress.com/2011/04/14/longest-common-substring-algorithm-in-java/
				//System.out.print(b[k]+" ");
		//	}
		//} 		*/
		int count=0,count1=0,x=0,flag=1;
		for(int i=0;i<n1;i++)
		{
			for(int j=x;j<n;j++)
			{
				if(ch1[i]==ch[j])
				{
					count++;
					x=j+1;
					break;
				}
				else if(count>0 && ch1[i]!=ch[j])
				{
					if(count>count1)
					{
						count1=count;
					}
					count=0;
					x=j+1;
					i=-1;
					break;
				}
			}
			if(count==0 && count1==0)
			{
				break;
			}
			else if(count==0 && count1!=0)
			{
				//System.out.print(i+" "+x+" "+count+" "+count1);
			}
		}
		if(count>count1)
		{
			count1=count;
		}
		if(count1>0)
		{
			for(int i=0;i<count1;i++)
			{
				System.out.print(ch1[i]);
			}
		}
		else
		{
			System.out.print("no common substring");
		}
		sc.close();
	}
}
