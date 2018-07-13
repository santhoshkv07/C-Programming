import java.util.*;
public class Laboratoryexperiment {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]==4 || a[i]==78 || a[i]==1)
			{
				System.out.println("+");
				continue;
			}
			else
			{
				String str=String.valueOf(a[i]);
				if(str.length()>=3)
				{
					if(str.charAt(str.length()-2)=='3' && str.charAt(str.length()-1)=='5') 
					{
						System.out.println("-");
						continue;
					}
					if(str.charAt(str.length()-1)=='4') 
					{
						int count=0;
						for(int j=0;j<str.length()-1;j++)
						{
							if(str.charAt(j)=='9')
							{
								System.out.println("*");
								count=1;
								break;
							}
						}
						if(count==1)
							continue;
					}
				}
				if(str.length()>3)
				{
					if(Integer.parseInt(str.substring(0,3))==190 && Integer.parseInt(str.substring(3,str.length()))>=0)
					{
						System.out.println("?");
						continue;
					}
				}
			}
		}
		sc.close();
	}
}
