package nice;
public class JStudent3 
{
	String Name;
	char sex;
	int stuID;
	
	
	public void setname(String stuName)
	{
		Name = stuName;
	}
	public static void main(String[] args)
	{
		JStudent3 s1 = new JStudent3();
		s1.Name = "zhangsan";
		System.out.println("变量name的值为："+s1.Name);
		s1.setname("lisi");
		System.out.println("变量name的值现在为："+s1.Name);
	}
}
