/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++)
	{
	    a[i]=sc.nextInt();
	}
	for(int i=0;i<n-1;i++)
	{
	    if(a[i]>a[i+1])
	    {
	        System.out.print(a[i+1]+" ");
	    }
	    else
	    {
	        System.out.print("-1"+" ");
	    }
	}
	 System.out.print("-1");
	}
}
