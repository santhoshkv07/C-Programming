package sample;

import java.util.Scanner;

public class Doubleseachunittimerun {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int distance=sc.nextInt();
		int count=0;
		for(int i=1;i<=distance;i=i*2)
		{
			if(i==distance)
			{
				count++;
				break;
			}
		}
		if(count!=0)
		{
			System.out.print("yes..dog can reach at the end");
		}
		else
		{
			System.out.print("no..dog cannot reach at the end");
		}
		sc.close();
	}

}
