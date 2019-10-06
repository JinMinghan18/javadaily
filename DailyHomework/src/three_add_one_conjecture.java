
import java.util.Scanner;
public class three_add_one_conjecture {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int count = 0;
		while(n !=1) {
			if(n%2 == 0) {
				n /= 2;
				count ++;
			}
			else {
				n = 3 * n + 1;
			}
		}
		System.out.println(count);
	}
}