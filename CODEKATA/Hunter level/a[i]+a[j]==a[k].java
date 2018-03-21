import java.util.*;
class main
{
    public static void main (String[] args) 
    {
        int i,j,k;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                for(k=j+1;k<n;k++)
                {
                    if(a[i]+a[j]==a[k])
                    {
                        System.out.printf("%d %d %d\n",a[i],a[j],a[k]);
                    }
                }
            }
        }
    }
}
