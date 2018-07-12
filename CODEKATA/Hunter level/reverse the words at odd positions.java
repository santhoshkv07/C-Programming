/*package whatever //do not write package name here */

import java.util.*;

class GFG {
	public static void main (String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String[] str=s.split("\\s");
	int n=str.length;
	for(int i=0;i<n;i++)
	{
    	 if(i%2!=0)
    	 {
    	  System.out.print(str[i]+" ");   
    	 }
    	 else
    	 {
    	     String x="";
        	 for(int j=str[i].length()-1;j>=0;j--)
        	 {
        	     x=x+str[i].charAt(j);
        	 }
        	 System.out.print(x+" ");
    	 }
	}
}
}
