import java.util.Scanner;
public class sushudui {
	static int flag = 0;
	
	public static void check(int num) {
		int tmp=(int)Math.sqrt(num);
        flag = 0;
        for(int i=2;i<=tmp;i++) {
            if(0==num%i)
                flag = 1;
        }
	}
	public static void main(String[] args) {
		int n;
		Scanner cin = new Scanner(System.in);
		
		while(cin.hasNext()) {
			n = cin.nextInt();
			for(int i=2;i<n;i++) {
				check(i);
				if(flag == 0) {
					check(i+2);
					if(flag == 0) {
						int b = i+2;
						System.out.println(i+ " "+ b);
					}
					else continue;
					
				}
				else continue;
			}
			System.out.println("Done");
		}
		
	}
}