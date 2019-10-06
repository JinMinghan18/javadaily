package nice;

public class JPassTest 
{
	float ptValue;
	
	public void changeInt(int value)
	{
		value = 55;
	}
	
	public void changeStr(String value)
	{
		value = new String("world");
	}
	
	public void changeObjValue(JPassTest ref)
	{
		ref.ptValue = 99.0f;
	}
	
	public static void main(String[] args)
	{
		String str;
		int val;
		JPassTest pt = new JPassTest();
		val = 11;
		pt.changeInt(val);
		System.out.println("Int value is:"+val);
		str = new String("hello");
		pt.changeStr(str);
		System.out.println("Str value is:"+str);
		pt.ptValue = 101.0f;
		pt.changeObjValue(pt);
		System.out.println("Pt value is:"+pt.ptValue);
	}
}
