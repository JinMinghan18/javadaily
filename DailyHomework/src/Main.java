import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		String s;
		Scanner scan = new Scanner(System.in);
		s = scan.nextLine();
		char[] ch = s.toCharArray();
		int a = 0,b = 0;
		int flag = 1;
		for(int i = 0;i < ch.length;i++) {
			if(ch[i] == ':') {
				flag = 0;
				continue;
			}
			else {
				if(flag==1) {
					a = a*10+(ch[i]-48);
				}
				else {
					b = b*10+(ch[i]-48);
				}
			}
		}
		String ans;
		if(a<12||a == 24) {
			ans = "AM";
			if(a == 24) a = 0;
		}
		else{
			ans = "PM";
			if(a > 12) {
				a-=12;
			}
		}
		System.out.print(a);
		System.out.print(":");
		System.out.println(b+" "+ans);
	}

}
