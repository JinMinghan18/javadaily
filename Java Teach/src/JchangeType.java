
public class JchangeType 
{
	public static void main(String[] args)
	{
		byte a = 10;
		short b = 20;
		int c = a + b;
		System.out.println("c = "+ c);
		testType(c);
	}
	public static void testType(long c)
	{
		long d = c;
		System.out.println("d = " + d);
	}
}
