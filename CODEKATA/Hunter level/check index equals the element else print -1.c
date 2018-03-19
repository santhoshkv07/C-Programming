#include <stdio.h>
int main() 
{
	int n,a[10],i,j,temp=0,k=0,b[10];
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
	    scanf("%d ",&a[i]);
	}
	for(i=0;i<n;i++)
	{
	    if(a[i]==i)
	    {
	        b[k++]=a[i];
	    }
	}
	if(k==0)
	{
	    printf("-1");
	}
	else
	{
	for(i=0;i<k;i++)
	{
	    for(j=i+1;j<k;j++)
	    {
	        if(b[i]>b[j])
	        {
	            temp=b[j];
	            b[j]=b[i];
	            b[i]=temp;
	        }
	    }printf("%d ",b[i]);
	}
	}
	return 0;
}
