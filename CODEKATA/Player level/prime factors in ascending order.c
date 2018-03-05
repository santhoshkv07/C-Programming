#include <stdio.h>
int main()
{
    int n,i,flag=0,count=0,j;
	scanf("%d",&n);
	for(i=2;i<=(n/2);i++)
	{
	    count=0;
	    flag=0;
	    if(n%i==0)
	    {
	        for(j=1;j<=i;j++)
	        {
	            if(i%j==0)
	            {
	                count++;
	            }
	        }
	        if(count==2)
	        {
	            printf("%d ",i);
	            flag=1;
	        }
	    }
	}
	return 0;
}
