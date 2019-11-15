package oj_experi3;
import java.util.Scanner;
public class FindtheWinner {
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		int n,m;
		
		n = cin.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = cin.nextInt();
		}
		m = cin.nextInt();
		for(int i=0;i<m;i++) {
			int c = cin.nextInt();
			int flag = 0;
			for(int j = 0;j<n;j++) {
				if(a[j] == c)
					flag = 1;
			}
			if(flag == 1)	System.out.println("true");
			else	System.out.println("false");
		}
	}
}
