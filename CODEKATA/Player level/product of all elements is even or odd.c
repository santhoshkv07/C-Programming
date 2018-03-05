#include <stdio.h>
int main()
{
    int n,i,mul=1,a[10];
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
	    scanf("%d",&a[i]);
	}
	for(i=0;i<n;i++)
	{
	    mul=mul*a[i];
	}
	if(mul%2==0)
	{
	    printf("even");
	}
	else
	{
	    printf("odd");
	}
	return 0;
}
