package nice;

public class JthisTest 
{
	String a;
	char b;
	int c;
	
	public void setValue1(String aa, char bb, int cc)
	{
		this.a = aa;
		this.b = bb;
		this.c = cc;
	}
	
	public void setValue2(String a,char b, int c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public static void main(String[] args)
	{
		JthisTest s = new JthisTest();
		s.setValue1("hello", 'X', 10);
		System.out.println("执行setValue1方法后的情况：a = "+s.a+" b = "+s.b + " c= "+s.c);
		s.setValue2("hi", 'Y', 100);
		System.out.println("执行setValue2方法后的情况：a = "+s.a+" b = "+s.b + " c= "+s.c);
	}
}
