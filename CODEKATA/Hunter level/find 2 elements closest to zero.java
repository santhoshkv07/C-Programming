import java.util.*;
class main
{
    public static void main (String[] args) 
    {
        int i,j,sum=0,x=0,y=0;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(i=0;i<n;i++)
        {
            sum=0;
           for(j=i+1;j<n;j++)
           {
               sum=a[i]+a[j];
               if(sum==0)
               {
                   x=a[i];
                   y=a[j];
               }
           }
        }
       System.out.print(x+" "+y);
    }
}
