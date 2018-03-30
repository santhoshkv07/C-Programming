import java.util.Scanner;
public class Dimenarray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int count=0,x=0,i,j,m,l;
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[][]=new int[n][k];
        for(i=0;i<n;i++)
        {
            for(j=0;j<k;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<n;i++)
        {
        	count=0;
        	for(j=0;j<k;j++)
        	{
        		x=a[i][j];
        		count=1;
        		for(m=i+1;m<n;m++)
        		{
        			for(l=0;l<k;l++) 
        			{
        				if(x==a[m][l])
        				{
        					count++;
        					break;
        				}
        			}
        		}
        		if(count==n)
        		{
        			System.out.print(x+" ");
        		}
        		
        	}        	
        }
        sc.close();
       
    }
}
