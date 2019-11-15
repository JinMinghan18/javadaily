package oj_experi5;

import java.util.Calendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.*;
public class Main {
	public static void main(String args[]) {
		Calendar c =Calendar.getInstance();
		Scanner cin = new Scanner(System.in);
		
		String strDateFormat = "yyyy-MM-dd EEEE";
		SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat,Locale.ENGLISH);
		while(cin.hasNext()) {
			c.set(2000,0,1);
			int num;
			num = cin.nextInt();
			c.add(Calendar.DATE, num);
			int yea = c.get(Calendar.YEAR);
			int mon = c.get(Calendar.MONTH)+1;
			int day = c.get(Calendar.DATE);
			c.set(yea,mon-1,day);
			System.out.println(sdf.format(c.getTime()));
		}
	}
}
