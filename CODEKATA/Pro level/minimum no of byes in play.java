package sample;

import java.util.Scanner;

public class Minimumbyes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0)
		{
			System.out.print(0);	
		}
		else
		{
			System.out.print(1);
		}
		sc.close();
	}
}
