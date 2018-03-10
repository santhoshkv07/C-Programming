#include <stdio.h>
int main(void) 
{
  int a[10],b[10],k=0,i,j,n;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
      scanf("%d ",&a[i]);
  }
  for(i=0;i<n;i++)
  {
      for(j=i-1;j>=0;j--)
      {
      if(a[i]%a[j]==0)
      {
          count++;
          b[k]=a[i];
          k++;
      }
      }
  }
	return 0;
}
