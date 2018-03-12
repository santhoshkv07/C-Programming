#include <stdio.h>
int main()
{
    long int n;
    int k=0,i,rem,n1,b[6],count=0;
	scanf("%ld %d\n",&n,&n1);
	while(n!=0)
	{
	    rem=n%10;
	    b[k]=rem;
	    k++;
	    n=n/10;
	}
	for(i=k-1;i>=0;i--)
    {
       count++;
       if(count<=n1)
       {
           continue;
       }
       else{
           printf("%d ",b[i]);
       }
    }
	return 0;
}
