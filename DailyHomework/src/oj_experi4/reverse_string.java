package oj_experi4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class reverse_string {
	public static void main(String args[]){
		Scanner cin = new Scanner(System.in);
		String str;
		while(cin.hasNext()) {
			str = cin.nextLine();
			int point = 0;
			String []ss = new String[100000];
			int cnt = 0;
			for(int i = 0;i<str.length();i++)
			{
				char a;
				a = str.charAt(i);
				if(a == ' ') {
					ss[cnt] = str.substring(point,i);
					point = i+1;
					cnt++;
				}
				if(a == '.') {
					ss[cnt] = str.substring(point,i);
					break;
				}
			}
			for(int j=cnt;j>=0;j--) {
				System.out.print(ss[j]+' ');
			}
		}
	}
}

