#include <stdio.h>
int main()
{
    int n,a[10],i,j,temp;
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
	    scanf("%d ",&a[i]);
	}
	for(i=0;i<(n/2);i++)
	{
	   for(j=i+1;j<(n/2);j++)
	   {
	   if(a[i]>a[j])
	   {
	       temp=a[j];
	       a[j]=a[i];
	       a[i]=temp;
	   }
	   }
	}
	for(i=(n/2);i<n;i++)
	{
	    for(j=i+1;j<n;j++)
	    {
	        if(a[i]<a[j])
	        {
	            temp=a[j];
	            a[j]=a[i];
	            a[i]=temp;
	        }
	    }
	}
	for(i=0;i<n;i++)
	{
	    printf("%d ",a[i]);
	}
	return 0;
}
