
import java.util.Scanner;
public class Reverse_chaeacters {
	public static void main(String[] args) {
		char a,b,c;
		Scanner cin = new Scanner(System.in);
		String s = cin.next();
		
		a = s.charAt(0);
		b = s.charAt(1);
		c = s.charAt(2);
		if(c == '0') {
			if(b == '0') {
				System.out.print(a);
			}
			else {
				System.out.print(b);
				System.out.print(a);
			}
		}
		else {
			System.out.print(c);
			System.out.print(b);
			System.out.print(a);

		}
	}
}



