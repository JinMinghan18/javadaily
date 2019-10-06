import java.io.*;
import java.util.*;
public class IntageAdd {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()) {
			int a = 1;
			int b = cin.nextInt();
			int c = (a+b)*b/2;
			System.out.println(c);
		}
	}
}

