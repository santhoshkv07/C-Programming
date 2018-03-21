import java.util.*;
class main
{
    public static void main (String[] args) 
    {
        int i,j,count=0;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int n1=s.nextInt();
        int a[]=new int[n];
        int b[]=new int[n1];
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(j=0;j<n1;j++)
        {
            b[j]=s.nextInt();
        }
       if(n1>=n)
       {
           System.out.println("NOT POSSIBLE");
       }
       else
       {
           for(i=0;i<n1;i++)
           {
               for(j=0;j<n;j++)
               {
               if(b[i]==a[j])
               {
                   count++;
                   a[j]='+';
                   break;
               }
               }
           }
           if(count==n1)
           { 
               System.out.println("YES..It is a subarray");
           }
           else
           {
               System.out.println("NO..not a subarray");
           }
       }
    }
}
