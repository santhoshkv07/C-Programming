package arrays.java;

import java.util.Scanner;

public class Occurenceofnum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int count=0,rem=0;
		for(int i=1;i<=n1;i++)
		{
			if(i==2)
			{
				count++;
			}
			else if(i>10)
			{
				int n=i;
				while(n!=0)
				{
					rem=n%10;
					if(rem==2)
					{
						count++;
					}
					n=n/10;
				}
			}
		}
		System.out.print(count);
		sc.close();
	}
}
