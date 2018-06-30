/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=0,x=0;
	if(n%2==0)
	{
	    c=a+b;
	    if(n%c==0)
	    {
	        System.out.print("yes..possible of equal groups");
	    }
	    else
	    {
	        System.out.print("not possible..no equal groups");  
	    }
	}
	else
	{
	    System.out.print("not possible..no equal groups");    
	}
	}
}
