import java.io.*;
import java.util.*;
public class speedCheck_7_8 {
	public static void main(String args[]) {
		int a;
		Scanner cs = new Scanner(System.in);
		a = cs.nextInt();
		if(a <=60) {
			System.out.println("Speed: "+a+" - OK");
		}
		else System.out.println("Speed: "+a+" - Speeding");
	}
}
