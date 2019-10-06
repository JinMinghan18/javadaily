package extend;

public class JStudentTest {
	public static void main(String[] args) {
		JStudent student = new JStudent();
		student.name = "赵六";
		//student.sex = '男';
		//student.age = 19;
		//student.studentID = "2013010101";
		//student.major = "计算机";
		System.out.println("学生姓名是: "+student.name);
		System.out.println("学生姓名是: "+student.getName());
		System.out.println("学生姓名是: "+student.getName2());
		
		/*System.out.println("学生性别是: "+student.getSex());
		System.out.println("学生年龄是: "+student.getage());
		System.out.println("学生学号是: "+student.getStudentID());
		System.out.println("学生专业是: "+student.getMajor());*/
	}
}
