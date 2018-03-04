#include <stdio.h>
#include<string.h>
int main()
{
	char a[10];
	int n,i,count=0,len=0;
	scanf("%[^\t\n]s",a);
	n=strlen(a);
	for(i=0;i<n;i++)
	{
	   if(a[i]!=' ')
	   {
	       printf("%c",a[i]);
	       len++;
	   }
	   else if(a[i]==' ')
	   {
	       count++;
	   }
	}
	printf(" ");
	for(i=(len+2);i<=n;i++)
	{
	    a[i]=a[len+count];
	    printf("%c",a[i]);
	}
	return 0;
}
