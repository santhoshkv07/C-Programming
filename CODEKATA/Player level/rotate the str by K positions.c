#include <stdio.h>
#include<string.h>
int main()
{
	int n,k,i,j;
	char a[10],temp;
	scanf("%s",a);
	n=strlen(a);
	scanf("%d",&k);
	for(i=0;i<k;i++)
	{
	    temp=a[0];
    for(j=0;j<n;j++)
	{
	   a[j]=a[j+1];
	}
	    a[n-1]=temp;
	   
	} printf("%s",a);
	return 0;
}
