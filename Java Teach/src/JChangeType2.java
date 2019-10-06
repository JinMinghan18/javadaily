
public class JChangeType2 {
	public static void main(String[] agrs)
	{
		int a = 10;
		short b = 20;
		byte c = (byte) (a+b);
		System.out.println("c= "+ c);
		testType((byte)a);
	}
	public static void testType(byte a)
	{
		long d = a;
		System.out.println("d = " + d);
	}
}
