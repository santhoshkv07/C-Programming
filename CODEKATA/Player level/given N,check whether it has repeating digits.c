#include <stdio.h>
int main()
{
    int i=0,j,len=0,rem,flag=0;
    long int n;
	scanf("%ld",&n);
	long int a[n];
	while(n!=0)
	{
	    rem=n%10;
	    a[i]=rem;
	    i++;
	    len++;
	    n=n/10;
	}
	for(i=0;i<len-1;i++)
	{
	    for(j=i+1;j<len;j++)
	    {
	        if(a[i]==a[j])
	        {
	            printf("yes..has repeating digits");
	            flag=1;
	            break;
	        }
	    }
	}
	if(flag==0)
	{
	    printf("no..doesn't has repeating digits");
	}
	return 0;
}
