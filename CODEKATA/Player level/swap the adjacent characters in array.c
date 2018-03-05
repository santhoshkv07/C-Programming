#include <stdio.h>
int main()
{
	int a[10],i,j,n,temp;
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
	    scanf("%d",&a[i]);
	}
	for(i=0,j=i+1;i<n-1,j<n;i+=2,j+=2)
	{
	    temp=a[i];
	    a[i]=a[j];
	    a[j]=temp;
	}
	for(i=0;i<n;i++)
	{
	    printf("%d ",a[i]);
	}
	return 0;
}
