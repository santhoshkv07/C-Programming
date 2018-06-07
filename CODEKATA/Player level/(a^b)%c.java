package sample;

import java.util.Scanner;

public class Findpowerwithpercent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int res=1;
		for(int i=1;i<=b;i++)
		{
			res=res*a;
		}
		res=res%c;
		System.out.print(res);
		sc.close();
	}
}
