package nice;
public class JStudent4Test //JStudent4 的实例化
{
	public static void main(String[] args)
	{
		JStudent4 s1 = new JStudent4();
		s1.setname("zhangsan");
		s1.setsex('男');
		s1.setstuID(20130301);
		
		JStudent4 s2 = new JStudent4("lisi",'男',20130301);
		s2 = s1;
		s1 = null;
	}
}
