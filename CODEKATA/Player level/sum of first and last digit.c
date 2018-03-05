#include <stdio.h>
int main()
{
    int sum=0,count=0,temp,rem;
    long int n;
	scanf("%ld",&n);
	while(n!=0)
	{
	    rem=n%10;
	    count++;
	    if(count==1)
	    {
	        sum=sum+rem;
	    }
	    n=n/10;
	}
	sum=sum+rem;
	printf("%d",sum);
	return 0;
}
