package arrays.java;

import java.util.Scanner;

public class Binarysearch 
{
int fun(int a[],int l,int r,int k)
{
		int mid=0;
		if(l<r) // or if(l<=r) then mid=l+(r-l)/2;
		{
			mid=(r-l)/2;
			if(k==a[mid])
			{
				return mid;
			}
			else if(a[mid]<k)
			{
				return fun(a,mid+1,r,k);
			}
			else 
			{
				return fun(a,l,mid-1,k);
			}
		}
		return -1;
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
		int l=0,r=n-1;
		Binarysearch ob=new Binarysearch();
		int res=ob.fun(a,l,r,k);
		if(res==-1)
		{
			System.out.print("element not present in the array");
		}
		else
		{
			System.out.print("element is present in the array at the index "+res);
		} 
		/*int mid=l+(r-l)/2;
		System.out.print(a[mid]);
		int x=0,flag=0;
		if(k==a[mid])
		{
			flag++;
			x=mid;
		}
		else
		{
			if(k<a[mid])
			{
				for(int i=0;i<=mid-1;i++)
				{
					if(k==a[i])
					{
						flag++;
						x=i;
						break;
					}
				}
			}
			else
			{
				for(int i=mid+1;i<n;i++)
				{
					if(k==a[i])
					{
						flag++;
						x=i;
						break;
					}
				}
			}
		}
		if(flag!=0)
		{
			System.out.print("element is found at index "+x);
		}
		else
		{
			System.out.print("element is not found"); 
		} */
		sc.close();
		}
}
