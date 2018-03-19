#include <stdio.h>
int main()
{
    int n,a[n],b[n],k=0,i,j,temp=0,count=0;
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
	    scanf("%d ",&a[i]);
	}
	for(i=0;i<n;i++)
	{ 
	    if(a[i]=='+')
	    {
	        continue;
	    }
	    for(j=i+1;j<n;j++)
	    {
	    if(a[i]==a[j])
	    {
	        count=1;
	        b[k]=a[i];
	        k++;
	        a[j]='+';
	    }
	    }
	}
	for(i=0;i<k;i++)
	{
	    for(j=i+1;j<k;j++)
	    {
	        if(b[i]>b[j])
	        {
	            temp=b[i];
	            b[i]=b[j];
	            b[j]=temp;
	        }
	    }
	    printf("%d ",b[i]);
	}
	if(count!=1)
	{
	    printf("unique");
	}
	return 0;
}
