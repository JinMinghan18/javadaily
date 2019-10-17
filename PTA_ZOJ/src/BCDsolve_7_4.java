import java.io.*;
import java.util.*;
public class BCDsolve_7_4 {
	public static void main(String[] args) {
		int n = 0;
		Scanner cs = new Scanner(System.in);
		n = cs.nextInt();
		int a = n/16*10+n%16;
		System.out.println(a);
	}
}
