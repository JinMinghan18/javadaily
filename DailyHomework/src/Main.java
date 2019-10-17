import java.util.Scanner;
class circle{
	public circle(double a){radius = a;}
	public double radius = 0;
	double getaera(){
		return radius*radius*3.1415926535;
	}
}
class rectangle{
	public rectangle(double a,double b) {
		wight = a;
		height = b;
	}
	public double wight = 0;
	public double height = 0;
	double getaera(){
		return wight*height;
	} 
}
public class Main { 
	public static void main(String args[]) {
		String a;
		java.text.DecimalFormat df = new java.text.DecimalFormat("#.00");
		Scanner cin =new Scanner(System.in);
		while(cin.hasNext()) {
			a = cin.next();
			char check = a.charAt(0);
			if(check == 'c')
			{
				
				double rr;
				rr = cin.nextDouble();
				circle r1 = new circle(rr);
				double s = r1.getaera();
				String s1 = df.format(s);
				System.out.println(s1);
			}
			else {
				double w,h;
				w = cin.nextDouble();
				h = cin.nextDouble();
				rectangle z = new rectangle(w,h);
				double s = z.getaera();
				String s1 = df.format(s);
				System.out.println(s1);
			}
		}
		
	}
}
	




	


