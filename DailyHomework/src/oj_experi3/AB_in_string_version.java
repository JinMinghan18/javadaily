package oj_experi3;
import java.util.Scanner;
public class AB_in_string_version {
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()) {
			String str = cin.next();
			int flag = 1;
			int sum  = 0;
			for(int i=0;i<str.length();i++) {
				char c = str.charAt(i);
				if(i == 0 && c == '-') {
					flag = -1;
				}
				else {
					int num = (int)(c-'0');
					if(num<=9 && num>=0) {
						sum = sum*10+num;
					}
				}
			}
			String str2 = cin.next();
			int flag2 = 1;
			int sum2  = 0;
			for(int i=0;i<str2.length();i++) {
				char c = str2.charAt(i);
				if(i == 0 && c == '-') {
					flag2 = -1;
				}
				else {
					int num = (int)(c-'0');
					if(num<=9 && num>=0) {
						sum2 = sum2*10+num;
					}
				}
			}
			System.out.println(sum*flag+sum2*flag2);
		}
	}		
}
