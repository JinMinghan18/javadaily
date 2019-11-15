package oj_experi3;
import java.util.Scanner;
public class Substring_of_a_website_URL {
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		String str;
		while(cin.hasNext()) {
			str = cin.next();
			int c = 0;
			int count[] = new int[1000];
			for(int i=0;i<str.length();i++) {
				char a = str.charAt(i);
				if(a == '/') {
					count[c] = i;
					c++;
				}
			}
			for(int i=count[1]+1;i<count[2];i++) {
				char a = str.charAt(i);
				System.out.print(a);
			}
			System.out.println("");

		}
	}		
}
