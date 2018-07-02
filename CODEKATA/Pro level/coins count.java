//import java.util.Arrays;
import java.util.Scanner;
public class Coinssum
{
	public static int coin(int[] a,int total,int n)
	{
		int count=0;
		while(total!=0)
		{
			for(int i=0;i<n;i++)
			{
				if(total>=a[i])
				{
					total=total-a[i];
					count++;
					break;
				}
			}
		}
		return count;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int total=sc.nextInt();
		int[] a=new int[n];
		int t=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]<a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		int count=coin(a,total,n);
		System.out.print(count);
		sc.close();
	}
}
