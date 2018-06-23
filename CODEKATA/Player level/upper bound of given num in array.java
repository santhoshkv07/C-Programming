package arrays.java;

import java.util.Arrays;
import java.util.Scanner;

public class Lowerbound
{
	int[] funlwr(int a[],int k,int l,int r)
	{
		if(l==0 && r==0 && a[0]<=k)
		{
			//System.out.print(a[0]+" "+(l+1)+" "+(r+1)+" "+a[l]+" "+a[r]);
			return new int[] {a[0],1};
		}
		else if(l==0 && r==0 && a[0]>k)
		{
			System.out.println("no lowerbound element present");
			return new int[] {0,0};
		}
		int mid=l+(r-l)/2;
		if(l<=r)
		{
			if(k==a[mid])
			{
				return new int[] {a[mid],mid+1};
			}
			else if(k<a[mid])
			{
				return funlwr(a,k,l,mid-1);
			}
			return funlwr(a,k,mid+1,r);
		}
		return  new int[] {a[r],r+1};
	}
	
	int[] funupr(int a[],int k,int l,int r)
	{
		if(l==0 && r==0 && k<=a[0])
		{
			//System.out.print(a[0]+" "+(l+1)+" "+(r+1)+" "+a[l]+" "+a[r]);
			return new int[] {a[0],1};
		}
		else if(l==0 && r==0 && a[0]<k)
		{
			System.out.println("no upperbound element present");
			return new int[] {0,0};
		}
		int mid=l+(r-l)/2;
		if(l<=r)
		{
			if(k==a[mid])
			{
				return new int[] {a[mid],mid+1};
			}
			else if(k<a[mid])
			{
				return funupr(a,k,l,mid-1);
			}
			return funupr(a,k,mid+1,r);
		}
		return  new int[] {a[0],r+1};
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		/*for(int i=0;i<n;i++)
		{
		System.out.print(a[i]);
		} */
		int l=0,r=n-1;
		Lowerbound ob=new Lowerbound();
		int[] res=ob.funlwr(a,k,l,r);
		int[] res1=ob.funupr(a,k,l,r);
		if(res[0]==0 &&res[1]==0)
		{
			
		}
		else
		{
			System.out.println(res[0]+" is the lowerbound of "+k+" at position "+res[1]);
		}
		if(res1[0]==0 && res1[1]==0)
		{
			
		}
		else
		{
			System.out.println(res1[0]+" is the upperbound of "+k+" at position "+res1[1]);
		}
		sc.close();
	}
}
