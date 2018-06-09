package sample;

import java.util.Scanner;

public class Stonepaperscissorgame {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		char n1=sc.next().charAt(0);
		char n2=sc.next().charAt(0);
		if(n1=='R'|n1=='S'&& n2=='S'|n2=='R' && n1!=n2)
		{
			System.out.print("R");
		}
		else if(n1=='R'|n1=='P' && n2=='P'|n2=='R'&& n1!=n2)
		{
			System.out.print("P");
		}
		else if(n1=='S'|n1=='P' && n2=='P'|n2=='S'&& n1!=n2)
		{
			System.out.print("S");
		}
		else
		{
			System.out.print("D");
		}
		sc.close();
	}
}
