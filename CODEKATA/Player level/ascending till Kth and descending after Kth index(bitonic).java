import java.util.Scanner;

public class Bitonicarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int temp=0;
		int p=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int j=0;j<p;j++)
			{
				for(int k=j+1;k<p;k++)
				{
				if(a[j]>a[k])
				{
					temp=a[j];
					a[j]=a[k];
					a[k]=temp;
				}
				}System.out.print(a[j]+" ");
			}
		for(int j=p;j<n;j++)
		{
			for(int k=j+1;k<n;k++)
			{
				if(a[j]<a[k])
				{
					temp=a[j];
					a[j]=a[k];
					a[k]=temp;
				}
			}System.out.print(a[j]+" ");
		}
		sc.close();
	}

}
