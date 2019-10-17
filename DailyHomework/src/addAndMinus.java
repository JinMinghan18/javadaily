import java.util.Scanner;
public class addAndMinus {
	public static void main(String args[]) {
		int c;
		double a,b;
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()) {
			a = cin.nextDouble();
			b = cin.nextDouble();
			c = cin.nextInt();
			for(int i=0;i<c;i++)
			{
				double n ;
				n = cin.nextDouble();
				a += n; 				
			}
			if(a - b<0.0001) {
				System.out.println("true");
			}
			else System.out.println("false");
		}
	}
}
		