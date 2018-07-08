package arrays.java;
import java.util.*;
public class Mindistance {

	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int u=sc.nextInt();
		int v=sc.nextInt();
		int count=-1;
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		    if(a[i]==u)
		    {
		        count++;
		        for(int j=i+1;j<n;j++)
		        {
			         if(a[j]!=v && j!=n-1)
			         {
			             count++;
			         }
			         else if(a[j]==v)
			         {
			             count++;
			             break;
			         }
			         if(j==n-1 && a[j]!=v)
			         {
			        	 count=-1;
			        	 break;
			         }
		        }
		        if(count==-1)
		        {
		        	System.out.println("there is no minimum distance");
		        }
		        else
		        {
		        	System.out.println(count);
		        }
		        break;
		    }
		    else if(a[i]==v)
		    {
		        count++;
		        for(int j=i+1;j<n;j++)
		        {
			         if(a[j]!=u && j!=n-1)
			         {
			             count++;
			         }
			         else if(a[j]==u)
			         {
			             count++;
			             break;
			         }
			         if(j==n-1 && a[j]!=u)
			         {
			        	 count=-1;
			        	 break;
			         }
		        }
		        if(count==-1)
		        {
		        	System.out.println("there is no minimum distance");
		        }
		        else
		        {
		        	System.out.println(count);
		        }
		        break;
		    }
		}
		sc.close();
		}
	}
