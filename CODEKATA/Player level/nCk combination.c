#include <stdio.h>
int main()
{
	int n,k,res=1,denominator=1,ans,i;
	scanf("%d %d",&n,&k);
	if(n>=k)
	{
	for(i=1;i<=k;i++)
	{
	    res=res*n;
	    denominator=denominator*i;
	    n--;
	}
	ans=res/denominator;
	printf("%d",ans);
	}
	else
	{
	    printf("not valid input");
	}
	return 0;
}
