#include<stdio.h>
#include<string.h>
int main()
{
    char a[10],b[10];
    int cost=0,n,n1,i,j;
    scanf("%s %s",a,b);
    n=strlen(a);
    n1=strlen(b);
    if(n<=n1)
    {
    for(i=0,j=0;i<n,j<n1;i++,j++)
    {
       if(a[i]!=b[j])
       {
           cost++;
       }
       else if(a[i]==b[j])
       {
           continue;
       }
    }
    printf("%d",cost);
    }
    else
    {
        for(i=0,j=0;i<n1,j<n;i++,j++)
        {
            if(a[i]==b[j])
            {
                continue;
            }
            else if(a[i]!=b[j])
            {
                cost++;
            }
        }
        printf("%d",cost);
    }
	return 0;
}
