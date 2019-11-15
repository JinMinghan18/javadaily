package oj_experi4;
import java.util.*;
public class find_the_winner2 {
	public static void main(String args[]) {
		int n;
		Scanner cin = new Scanner(System.in);
		Set set = new HashSet();
		Integer a[] = new Integer [100001];
		Integer b[] = new Integer [100001];
		n = cin.nextInt();
		for(int i = 0;i<n;i++) {
			set.add(cin.nextInt());
		}
		int m = cin.nextInt();
		for(int i = 0;i<m;i++) {
			if(!set.add(cin.nextInt())) {
				System.out.println("true");
			}
			else System.out.println("false");
			
		}
	}
}
