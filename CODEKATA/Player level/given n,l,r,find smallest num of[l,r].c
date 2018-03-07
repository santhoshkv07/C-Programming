#include <stdio.h>
int main()
{
    int n,l,r,i,flag=0,j,a[10],temp;
	scanf("%d %d %d",&n,&l,&r);
	for(i=0;i<n;i++)
	{
	    scanf("%d ",&a[i]);
	}
	for(i=0;i<n;i++)
	{
	    for(j=i+1;j<n-1;j++)
	    {
	        if(a[i]>a[j])
	        {
	            temp=a[j];
	            a[j]=a[i];
	            a[i]=temp;
	        }
	    }
	}
    for(i=l;i<=r;i++)
	{
	   for(j=0;j<n;j++)
	   {
	       if(a[j]>=l && a[j]<=r)
	       {
	       if(a[j]==i)
	       {
	           printf("%d is the smallest number",a[j]);
	           flag=1;
	           break;
	       } 
	       }
	   }
	   if(flag==1)
	   {
	       break;
	   }
	} 
	if(flag!=1)
	{
	    printf("no");
	}
	return 0;
}
