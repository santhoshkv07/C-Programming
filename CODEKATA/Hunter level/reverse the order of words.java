/*package whatever //do not write package name here */

import java.util.*;
import java.util.Arrays;
class GFG {
	public static void main (String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String[] str=s.split("\\s");
	int n=str.length;
	for(int i=n-1;i>=0;i--)
	{
	    System.out.print(str[i]+" ");
	  }
}
}
