#include <stdio.h>
#include<string.h>
int main()
{
    int n,a[10],i,j;
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
	    scanf("%d",&a[i]);
	}
	for(i=0;i<n-1;i++)
	{
	    if(a[i]=='+')
	    {
	        continue;
	    }
        for(j=i+1;j<n;j++)
        {
            if(a[i]==a[j])
            {
                a[j]='+';
            }
        }
	}
	for(i=0;i<n;i++)
	{
	    if(a[i]!='+')
	    {
	        printf("%d ",a[i]);
	    }
	}
    return 0;
}
