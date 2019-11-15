package oj_experi4;

import java.util.Scanner;
import java.util.Stack;

public class Steak_USe {
	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);
		int n;
		while(cin.hasNext()) {
			n = cin.nextInt();
			String a;
			
			Stack stack = new Stack();
			for(int i = 0;i<n;i++) {
				a = cin.next();
				char a1 = a.charAt(0);
				if(a1 == 'A') {
					if(stack.empty()) {
						System.out.println("E");
					}
					else {
						Object aa = stack.peek();
						System.out.println(aa);
					}
				}
				else if(a1=='P') {
					String b;
					b = cin.next();
					stack.push(b);
				}
				else if(a1 =='O') {
					stack.pop();
				}
			}
			System.out.println("");
		}
	}
}
