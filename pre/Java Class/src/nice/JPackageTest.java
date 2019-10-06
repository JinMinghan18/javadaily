package nice;

import java.util.Calendar;

import chap2.JHelloWorldT;

public class JPackageTest {
	public static void main(String[] args) {
		JHelloWorldT s = new JHelloWorldT();
		s.test();
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.MONTH)+"月"+cal.get(Calendar.DATE)+"日");
	}
}
