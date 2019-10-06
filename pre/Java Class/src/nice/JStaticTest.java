package nice;

public class JStaticTest 
{
	String testName;
	public static void main(String[] args)
	{
		JStaticTest s = new JStaticTest();
		s.testName = JPerson2.name;
		System.out.println("testName的值为 "+s.testName);
		s.testName = JPerson2.setName("李四");
		System.out.println("JPerson2.name的值为 "+JPerson.name);
		System.out.println("现在tentName的值为   "+JPerson.name);
	
	}
}
