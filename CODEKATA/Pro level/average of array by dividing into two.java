/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] a=new int[n];
	int sum=0,sum1=0,avg=0,avg1=0,count=0,count1=0;
	for(int i=0;i<n;i++)
	{
	    a[i]=sc.nextInt();
	}
	for(int i=0;i<n/2;i++)
	{
	    sum=sum+a[i];
	    count++;
	}
	for(int i=n/2;i<n;i++)
	{
	    sum1=sum1+a[i];
	    count1++;
	}
	avg=sum/count;
	avg1=sum1/count1;
	if(avg==avg1)
	{
	    System.out.print("yes");
	}
	else
	{
	    System.out.print("no");
	}
	}
}
