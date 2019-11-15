package oj_experi4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	public static class Student implements Comparable {
		private long id;
		private String name;
		public Student(long i,String n) {
			this.id = i;
			this.name = n;
		}
		public String toString() {
			return id+" "+name;
		}
		@Override
		public int compareTo(Object arg0) {
			Student s = (Student)arg0;
			int r = id > s.id ? 1 : (id == s.id ? 0 : -1);
			return r;
		}
		
	}
	
	public static void main(String args[]){
		Scanner cin = new Scanner(System.in);
		long i;
		String na;
		ArrayList<Student> list = new ArrayList<Student>();
		int cnt = 0;
		while(cin.hasNext()) {
			i = cin.nextLong();
			na = cin.next()+" "+cin.next();
			if(na.equals(null))break;
			Student s = new Student(i, na);
			cnt++;
			list.add(s);
		}
		Collections.sort(list);
		for(int i1=0;i1<cnt;i1++)
		System.out.println(list.get(i1).toString());
	}
}

