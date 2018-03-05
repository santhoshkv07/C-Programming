#include <stdio.h>
#include<string.h>
int main()
{
    int n,a[10],i,j,sum=0,sum1=0,b[10],c[10],res[10];
	scanf("%d",&n);
	int k=0,l=n-1;                     
	for(i=0;i<n;i++)
	{
	    scanf("%d",&a[i]);
	}
	for(i=0;i<n;i++)            
	{
	    sum=sum+a[i];
	    b[k]=sum;
	    k++;
	}
    for(i=n-1;i>=0;i--)
    {
        sum1=sum1+a[i];
        c[l]=sum1;
        l--;                        
    }
    for(i=0,j=0;i<n,j<n;i++,j++)               
    {
        if(n>1)
        {
        res[i]=b[i]+c[j];
        }
        else
        {
            res[i]=a[i];
        }
    }
    for(i=0;i<n;i++)
    {
        printf("%d ",res[i]);
    }
    return 0;
}
