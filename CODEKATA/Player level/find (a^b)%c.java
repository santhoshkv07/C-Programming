import java.util.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int mul=1;
	    for(int i=1;i<=b;i++)
	    {
	        mul=mul*a;
	    }
		int res=mul%c;
		System.out.println(res);
	}
}
