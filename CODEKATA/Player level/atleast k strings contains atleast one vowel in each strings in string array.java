package javastrings.java;

import java.util.Scanner;

public class Atleastonevowel {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		/* String s1=sc.next();String s2=sc.next();
		int n=Integer.parseInt(s1);
		int k=Integer.parseInt(s2); */
		int n=sc.nextInt();int k=sc.nextInt();
		//ArrayList<String> al=new ArrayList<String>();
		String[] str=new String[n];
		/*for(int i=0;i<n;i++)
		{  
			al.add(sc.next());    //same use next();
		} */
		for(int i=0;i<n;i++)
		{
			str[i]=sc.next();        //always use next();
		}
		/*System.out.print(al.size());
		System.out.print(al.get(0));
		for(int i=0;i<al.size();i++)
		{
			char a[]=al.get(i).toCharArray();
		} */
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<str[i].length();j++)
			{
				if(str[i].charAt(j)=='a'||str[i].charAt(j)=='e'||str[i].charAt(j)=='i'||str[i].charAt(j)=='o'||str[i].charAt(j)=='u')
				{
					count++;
					//System.out.print(count);
					break;
				}
			}
		}
		System.out.println();
		if(count>=k)
		{
			System.out.print("yes.."+k+" strings contains atleast one vowels in all strings");
		}
		else
		{
			System.out.print("no..does not contain atleast one vowels in all strings");
		}
		sc.close();
	}
}
