import java.util.*;
class main
{
	public static void main(String[] args)
	{
		int n,i,j,temp=0,count=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
		    if(((i%2)==0) && ((a[i]%2)!=0))
		    {
		        System.out.print(a[i]+" ");
		    }
		    else if(((i%2)!=0) && ((a[i]%2)==0))
		    {
		        System.out.print(a[i]+" ");
		    }
		    else
		    {
		        continue;
		    }
		   
		}
}	
}
