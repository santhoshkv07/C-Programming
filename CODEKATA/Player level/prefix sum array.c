#include <stdio.h>
#include<string.h>
int main()
{
    int n,a[10],i,j,k=0,sum=0,b[10];
	scanf("%d",&n);
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
    for(i=0;i<n;i++)
    {
        printf("%d ",b[i]);
    }
    return 0;
}
