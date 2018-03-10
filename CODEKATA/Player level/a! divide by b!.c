#include <stdio.h>
int main(void) 
{
    int a,b,res,fact=1,fact1=1,i,j;
	scanf("%d %d",&a,&b);
	for(i=1;i<=a;i++)
	{
	    fact=fact*i;
	}
	for(j=1;j<=b;j++)
	{
	   fact1=fact1*j;
	}
	res=fact/fact1;
	printf("%d",res);
	return 0;
}
