/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] a=new int[n];
	int max=0,t=0;
	for(int i=0;i<n;i++)
	{
	    a[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
	{
	    for(int j=i+1;j<n;j++)
	    {
	        if(a[i]>a[j])
	        {
    	        t=a[i];
    	        a[i]=a[j];
    	        a[j]=t;
	        }
	    }
	}
	max=a[n-1]-a[0];
	System.out.print(max);
}
}
