package nice;
public class JStudent 
{
	String name;
	char sex;
	int stuID;
	
	public JStudent(String stuName, char sex, int stuID)
	{
		name = stuName;
		this.sex = sex;
		this.stuID = stuID;
	}
	public JStudent(){}
	
	public static void main(String[] args)
	{
		JStudent s1 = new JStudent("张三",'男',20130301);
		JStudent s2 = new JStudent();
	}
}
	
	
