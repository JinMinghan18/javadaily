package oj_experi3;
import java.util.Scanner;
public class diandao {
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()) {
			int n,m;
			n = cin.nextInt();
			m = cin.nextInt();
			int a[] = new int[100000];
			int b[] = new int[100000];
			for(int i=0;i<n;i++) {
				a[i] = cin.nextInt();
			}
			for(int i = 0;i<m;i++) {
				b[i] = cin.nextInt();
			}
			int s;
			s = cin.nextInt();
			for(int i=0;i<n;i++) {
				int flag = 0;
				for(int j = 0;j<m;j++) {
					if(a[i] == b[j]) {
						flag = 1;
						break;
					}
				}
				if(flag == 0 && a[i] == s) {
					System.out.println("YES");
					break;
				}
				else if(flag == 1) {
					continue;
				}
				else {
					System.out.println("NO");
					break;
				}
			}
		}
	}		
}
