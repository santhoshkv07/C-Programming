import java.util.Arrays;
import java.util.Scanner;

public class Maxnumformed {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		int[] num=new int[ch.length];
		int t=0;
		for(int i=0;i<ch.length;i++)
		{
			num[i]=Integer.parseInt(String.valueOf(ch[i]));
		}
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]<num[j])
				{
					t=num[i];
					num[i]=num[j];
					num[j]=t;
				}
			}
			System.out.print(num[i]);
		}
		//System.out.print(Arrays.toString(num).replaceAll(',',""));
		sc.close();
	}
}
