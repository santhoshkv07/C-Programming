package sample;

import java.util.Scanner;

public class Monthofayear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] str= {"jan","feb","mar","april","may","june","july","aug","sep","oct","nov","dec"};
		String[] num= {"01","02","03","04","05","06","07","08","09","10","11","12"};
		int n=num.length;
		String st=sc.nextLine();
		String[] s=st.split("-");
		for(int i=0;i<n;i++)
		{
			if(s[1].equals(num[i]))
			{
				System.out.print(str[i]);
				break;
			}
		}
		sc.close();
	}
}
