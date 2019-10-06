package extend;

public class JStudent2 extends JPeople2{
	private String studentID;
	private String major;
	
	public JStudent2(String name, char sex, int age, String stuID, String major) {
		super(name,sex,age);
		this.studentID = stuID;
		this.major = major;
	}
	
	public String getDetails() {
		return super.getDetails()+"\nStudentID:"+studentID+"\nMajor:"+major;
	}
	
	public static void main(String[] args)
	{
		JStudent2 s = new JStudent2("张三",'男',22,"2013030507","计算机");
		System.out.println(s.getDetails());
	}
}
