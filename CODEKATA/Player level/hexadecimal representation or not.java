import java.util.Scanner;

public class Hexadecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char[] temp= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		String s=sc.next();
		int n=s.length();
		char[] ch=s.toCharArray();
		int flag=0;
		for(int i=0;i<n;i++)
		{
			flag=0;
			for(int j=0;j<temp.length;j++)
			{
				if(ch[i]==temp[j])
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.print("noo..its not an hexadecimal representation");
				break;
			}
		}
		if(flag==1)
		{
			System.out.print("yes..its hexadecimal representation");
		}
		sc.close();
	}
}
