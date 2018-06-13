import java.util.Scanner;

public class Sumof3or7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%3==0 || n%7==0 ||n%(3+7)==0)
		{
			System.out.print("yes..represented as sum of 3 and 7");
		}
		else
		{
			System.out.print("no..represented as sum of 3 and 7");
		}
		sc.close();
	}
}
