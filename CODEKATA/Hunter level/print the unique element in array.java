import java.util.*;
class main
{
	public static void main(String[] args)
	{
		int n,i,j;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
		    if(a[i]=='+')
		    {
		        continue;
		    }
		for(j=i+1;j<n;j++)
		{
			if(a[i]==a[j])
			{
                a[i]='+';
                a[j]='+';
                break;
			}
		}
		if(a[i]!='+')
		{
		    System.out.println(a[i]);
		}
		}
}	
}
