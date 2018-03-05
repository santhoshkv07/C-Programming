#include <stdio.h>
#include<string.h>
int main()
{
    int n,a[10],i,j,sum=0,b[10];
	scanf("%d",&n);
	int k=n-1;                      //or k=0
	for(i=0;i<n;i++)
	{
	    scanf("%d",&a[i]);
	}
    for(i=n-1;i>=0;i--)
    {
        sum=sum+a[i];
        b[k]=sum;
        k--;                        //k++;
    }
    for(i=0;i<n;i++)                //for(i=n-1;i>=0;i--)
    {
        printf("%d ",b[i]);
    }
    return 0;
}
