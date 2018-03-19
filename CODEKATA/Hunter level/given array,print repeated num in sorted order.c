#include<stdio.h>
int main()
{
    int n,a[10],b[10],k=0,i,j,temp=0,count=0;
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
	    scanf("%d ",&a[i]);
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
	for(i=0;i<n-1;i++)
	{
	    count=0;
	    for(j=i+1;j<n;j++)
	    {
	        if(a[i]==a[j])
	        {
	            a[j]='+';
	            count=1;
	        }
	    }
	    if(count==1)
	    {
	       b[k]=a[i];
	       k++;
	    }
	}
    if(k!=0)
    {
        for(i=0;i<k;i++)
        {
            printf("%d ",b[i]);
        }
    }
    else
    {
        printf("unique");
    }
	return 0;
}
