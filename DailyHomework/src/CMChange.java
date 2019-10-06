
import java.util.Scanner;
public class CMChange{
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		int inch;   //英尺
		int foot = (int) (12*a/30.48);
		inch = foot/12;
		foot = foot%12;
		System.out.println(inch+" "+foot);
	}
}