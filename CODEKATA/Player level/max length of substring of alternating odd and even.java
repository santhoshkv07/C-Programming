package sample;

import java.util.Scanner;

public class Oddevenmaxlength 
{
	public static int maxlength(char[] ch,int n)
	{
			int count=1,max=-1;
			for(int i=0,j=i+1;i<n && j<n;i++,j++)
			{
				if(ch[i]%2==0 && (!(Character.isAlphabetic(ch[i]))))
				{
					if(!(ch[j]%2==0) && (!(Character.isAlphabetic(ch[j]))))
					{
						count++;
						//System.out.println(count);
					}
					else
					{
						if(count>=max)
						{
							max=count;
							count=1;
						}
					}
				}
				else if(!(ch[i]%2==0)&&(!(Character.isAlphabetic(ch[i]))))
				{
					if(ch[j]%2==0 && (!(Character.isAlphabetic(ch[j]))))
					{
						count++;
						//System.out.println(count);
					}
					else
					{
						if(count>=max)
						{
							max=count;
							count=1;
						}
					}
				}
			}
			if(count>=max && count!=1)
			{
				max=count;
			}
			return max;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		int n=ch.length;
		int len=maxlength(ch,n);
		if(len==-1 || len==1)
		{
			System.out.print(0);
		}
		else
		{
			System.out.print(len);
		}
		sc.close();
	}
}
