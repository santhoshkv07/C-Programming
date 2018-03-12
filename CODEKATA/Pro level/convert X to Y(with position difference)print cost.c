#include<stdio.h>
#include<string.h>
int main()
{
    char a[10],b[10];
    int cost=0,n,n1,i,j;
    scanf("%s %s",a,b);
    n=strlen(a);
    n1=strlen(b);
    for(i=0,j=0;i<n,j<n1;i++,j++)
    {
       if(a[i]!=b[j])
       {
          if(b[j]>a[i])
             cost=cost+(b[j]-a[i]);  
          else
             cost=cost+(a[i]-b[j]);
       }
       else if(a[i]==b[j])
       {
           continue;
       }
    }
    printf("%d",cost);
    return 0;
}
