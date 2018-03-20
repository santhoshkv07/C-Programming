import java.util.*;
class main
{
	public static void main(String[] args)
	{
		int n,i,j,x=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
		for(j=i+1;j<n;j++)
		{
			if(a[i]==a[j])
			{
                x=a[i];
                break;
			}
		}break;
		}
	    System.out.println(x);
}	
}
