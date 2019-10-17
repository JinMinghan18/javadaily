import java.util.Scanner;

public class wenduzhuanhuan {
	public static void main(String args[]) {
		double n;
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()) {
			n = cin.nextDouble();
			java.text.DecimalFormat df = new java.text.DecimalFormat("#.00");
			double a = 9*n/5+32.0;
			String s1 = df.format(a);
			System.out.println(s1);
		}
	}
}
	


