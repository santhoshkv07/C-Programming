#include<stdio.h>
#include<math.h>
#define pi 3.14
int main()
{
   int a;
   float res;
   scanf("%d",&a);
   res=sin(a*pi/180);
   printf("%0.1f",res);
   return 0;
}
