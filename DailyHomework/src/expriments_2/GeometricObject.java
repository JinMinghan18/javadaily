package expriments_2;

import java.util.Scanner;
class GeometricObjcet
{
	private double s;
	public double getArea()
	{
		return s;
	}
}
class Circle extends GeometricObjcet
{
	private double radius;
	Circle(double radiu){radius=radiu;}
	public double getArea()
	{
		return radius*radius*3.1415926535;
	}
}
class Rectangle extends GeometricObjcet
{
	Rectangle(double w,double h){width=w;height=h;}
	private double width;
	private double height;
	public double getArea()
	{
		return width*height;
	}
}

public class GeometricObject {
	public static void main(String[] args ) {
		String a;
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()) {
			a=cin.next();
			char c=a.charAt(0);
			if(c=='c')
			{
				double radiu;
				radiu=cin.nextDouble();
				Circle cir=new Circle(radiu);
				double t=cir.getArea();
				System.out.println(String.format("%.2f", t));
			}
			if(c=='r')
			{
				
				double w,h;
				w=cin.nextDouble();
				h=cin.nextDouble();
				Rectangle Rec=new Rectangle(h,w);
				double p=Rec.getArea();
				System.out.println(String.format("%.2f", p));
			}
		}
}
}
