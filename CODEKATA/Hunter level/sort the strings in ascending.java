import java.util.*;

class GFG {
	public static void main (String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String[] s=new String[n];
	String t="";
	for(int i=0;i<n;i++)
	{
	    s[i]=sc.next().toLowerCase();
	}
	for(int i=0;i<n;i++)
	{
	    for(int j=i+1;j<n;j++)
	    {
	        if(s[i].compareTo(s[j])>0)
	        {
	            t=s[i];
	            s[i]=s[j];
	            s[j]=t;
	        }
	    }
	}
	for(int i=0;i<n;i++)
	{
	    System.out.println(s[i]);
	}
	}
}
	
