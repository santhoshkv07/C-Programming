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
		for(j=i+1;j<n;j++)
		{
			if(a[i]>a[j])
			{
			    temp=a[i];
			    a[i]=a[j];
			    a[j]=temp;
			}
		}
		}
		for(i=n-1;i>=0;i--)
		{
		    System.out.print(a[i]);
		}
}	
}
