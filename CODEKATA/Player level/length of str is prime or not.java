import java.util.Scanner;
class Primelength
{
		public static void main (String[] args)
		{
		    Scanner sc=new Scanner(System.in);
		    String s=sc.nextLine();
		    char[] ch=s.toCharArray();
		    int n=ch.length;
		    int count=0,flag=0;
		    for(int i=0;i<n;i++)
		    {
		        count++;
		    }
		    //System.out.print(count);
		    for(int i=1;i<=count;i++)
		    {
		        if(count%i==0)
		        {
		            flag++;
		        }
		    }
		    if(flag==2)
		    {
		        System.out.print("yes..length is prime");
		    }
		    else
		    {
		        System.out.print("no..length is not prime");
		    }
		    sc.close();
		}
}
