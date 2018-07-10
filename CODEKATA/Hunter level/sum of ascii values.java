
import java.util.*;

class GFG {
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	char[] ch=s.toCharArray();
	int n=ch.length;
	int sum=0;
	for(int i=0;i<n;i++)
	{
	    sum=sum+(int)ch[i];
	}
	System.out.print(sum);
	}
}
