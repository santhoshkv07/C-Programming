#include <stdio.h>
int main()
{
	int n,k,res=1,i;
	scanf("%d %d",&n,&k);
	if(n>=k)
	{
	for(i=0;i<k;i++)
	{
	    res=res*n;
	    n--;
	}
	printf("%d",res);
	}
	else
	{
	    printf("not valid input");
	}
	return 0;
}
