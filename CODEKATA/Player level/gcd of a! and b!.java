import java.util.Scanner;

public class Gcdfactorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a==0 || b==0)
		{
			System.out.print(0);
		}
		else if(a==1 || b==1)
		{
			System.out.print(1);	
		}
		else if(a<0 || b<0)
		{
			System.out.print("not possible with negative numbers");
		}
		else
		{
			int i=a,fact=1,fact1=1,gcd=1;
			while(i!=0)
			{
				fact=fact*i;
				i--;
			}
			i=b;
			while(i!=0)
			{
				fact1=fact1*i;
				i--;
			}
			for(int j=1;j<=fact && j<=fact1;j++)
			{
				if(fact%j==0 && fact1%j==0)
				{
					gcd=j;
				}
			}
			System.out.print("gcd of "+a+"! and "+b+("! is "+gcd));
		}
		sc.close();
	}
}
