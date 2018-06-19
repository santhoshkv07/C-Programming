package javastrings.java;

//import java.util.Arrays;
import java.util.Scanner;

public class Differenceofstrings {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String[] str1=s1.split("\\s+");
		String[] str2=s2.split("\\s+");
		int res=0;
		if(str1.length>1 && str2.length>1)
		{
			int n1=str1.length;
			int n2=str2.length;
			if(n1>=n2)
			{
				for(int i=0;i<n1;i++)
				{
					res=0;
					for(int j=0;j<n2;j++)
					{
						res=0;
						if(str2[j]=="+")
						{
							continue;
						}
						if(str1[i].equals(str2[j]))
						{
							res=1;
							str2[j]="+";
							break;
						}
					}
					if(res!=1)
					{
						System.out.println("2:"+str1[i]+" ");
					}
				}
				for(int i=0;i<n2;i++)
				{
					if(str2[i]!="+")
					{
						System.out.println("1:"+str2[i]+" ");
					}
				}
			}
			else
			{
				for(int i=0;i<n2;i++)
				{
					res=0;
					for(int j=0;j<n1;j++)
					{
						res=0;
						if(str1[j]=="+")
						{
							continue;
						}
						if(str2[i]==str1[j])
						{
							res=1;
							str1[j]="+";
							break;
						}
					}
					if(res!=1)
					{
						System.out.println("1:"+str2[i]+" ");
					}
				}
				for(int i=0;i<n1;i++)
				{
					if(str1[i]!="+")
					{
						System.out.println("2:"+str1[i]+" ");
					}
				}
			}
		}
		else
		{
			char[] ch1=s1.toCharArray();
			char[] ch2=s2.toCharArray();
			int n1=ch1.length;
			int n2=ch2.length;
			if(n1>=n2)
			{
				for(int i=0;i<n1;i++)
				{
					res=0;
					for(int j=0;j<n2;j++)
					{
						res=0;
						if(ch2[j]=='+')
						{
							continue;
						}
						if(ch1[i]==ch2[j])
						{
							ch2[j]='+';
							res=1;
							break;
						}
					}
					if(res!=1)
					{
						System.out.println("2:"+ch1[i]+" ");
					}
				}
				for(int i=0;i<n2;i++)
				{
					if(ch2[i]!='+')
					{
						System.out.println("1:"+ch2[i]+" ");
					}
				}
			}
			else
			{
				for(int i=0;i<n2;i++)
				{
					res=0;
					for(int j=0;j<n1;j++)
					{
						res=0;
						if(ch1[j]=='+')
						{
							continue;
						}
						if(ch2[i]==ch1[j])
						{
							ch1[j]='+';
							res=1;
							break;
						}
					}
					if(res!=1)
					{
						System.out.println("1:"+ch2[i]+" ");
					}
				}
				for(int i=0;i<n1;i++)
				{
					if(ch1[i]!='+')
					{
						System.out.println("2:"+ch1[i]+" ");
					}
				}
			}
	}
		sc.close();
	}
}
