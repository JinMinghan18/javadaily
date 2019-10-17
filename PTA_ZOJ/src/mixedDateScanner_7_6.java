import java.util.Scanner;
import java.text.*;
public class mixedDateScanner_7_6 {
	public static void main(String args[]) {
		double a;
		int b;
		char c;
		String str;
		double d;
		Scanner cin = new Scanner(System.in);
		a = cin.nextDouble();
		b = cin.nextInt();
		str = cin.next();
		c = str.charAt(0);
		d = cin.nextDouble();
		java.text.DecimalFormat df = new java.text.DecimalFormat("#.00");
		String s1 = df.format(a);
		String s2 = df.format(d);
		System.out.print(c);
		System.out.print(" ");
		System.out.print(b);
		System.out.print(" ");
		System.out.print(s1);
		System.out.print(" ");
		System.out.print(s2);
	}
}
