package extend;

public class JStudent extends JPeople{
	String studentID;
	String major;
	String name;
	
	public String getName() {
		return "王五";
	}
	public String getName2() {
		super.name = "张三";
		return super.getname();
	}
	public String getMajor() {
		return major;
	}
	
	public String getStudentID() {
		return studentID;
	}
}
