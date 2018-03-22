import java.util.*;
class main
{
    public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int temp=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
           a[i]=sc.nextInt(); 
        }
        if(n>=k)
        {
            for(int i=0;i<n;i++)
            {
                for(int j=i+1;j<n;j++)
                {
                    if(a[i]<a[j])
                    {
                        temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }
                }
            }System.out.print(a[k-1]);
        }
        else
        {
            System.out.print("not possible");
        }
    }
}
