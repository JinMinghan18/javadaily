package experiments_5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable{
	String id;
	String Name;
	public Student(String s1,String s2) {
		id = s1;
		Name = s2;
	}
	public Student() {
		id = null;
		Name = null;
	}
	public int compareTo(Object o) {
		Student s = (Student) o;
		return this.id.compareTo(s.id);
	}
}

public class filein {

	public static void main(String[] args) throws IOException {
		ArrayList<Student> list = new ArrayList<Student>();
		int cnt = 0;
		FileWriter wf = new FileWriter("班级名单1.txt");
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(
			new InputStreamReader(new FileInputStream("班级名单.txt"),"gb2312"));
			String line = reader.readLine();
			System.out.println(line);
			while(line!=null) {
				System.out.println(line);
				String [] s = line.split("\t");
				Student s1 = new Student(s[0],s[1]);
				list.add(s1);
				cnt++;
				line = reader.readLine();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		Collections.sort(list);
		Student t = new Student();
		for(int j = 0;j<cnt;j++) {
			t = list.get(j);
			System.out.println(t.id+"  "+t.Name+"\t");
		}
		wf.close();
	}

}
