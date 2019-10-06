package nice;

public class JFinalTest {
	final static int number = 100;
	
	public static void main(String args[])
	{
		final JPerson2 s1 = new JPerson2();
		JPerson2 s2 = new JPerson2();
		s1.setValue(30, "美国");
		System.out.println("s1.age的值为"+s1.age+" s1.country是值为 " + s1.country);
	}
}
