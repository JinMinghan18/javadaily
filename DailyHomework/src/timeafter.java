
import java.util.Scanner;
public class timeafter{
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int time1 = cin.nextInt();
		int hour = time1/100;
		int minute = time1-100*hour;
		int addTime = cin.nextInt();
		int time = hour*60 + minute + addTime;
		int hour2 = time/60;
		int minute2 = time%60;
		System.out.println(hour2*100 + minute2);
	}
}
