package sample;
import java.util.*;
public class Greatestelementright {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int max=-1;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[j]>max)
				{
					max=a[j];
				}
			}
			a[i]=max;
			max=-1;
		}
		for(int i=0;i<n;i++)
		{
			if(i==n-1)
			{
				System.out.print(0);
			}
			else
			{
				System.out.print(a[i]+" ");
			}
		}
		sc.close();
	}
}
