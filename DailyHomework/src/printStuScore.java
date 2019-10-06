
public class printStuScore {
	public static String retLevel(int score){
		if(score>=90)
			return "优";
		else if(score>=80 && score<90)
			return "良";
		else if(score>=70 && score<80)
			return "中";
		else if(score>=60 && score<70)
			return "及格";
		else return "不及格";
	}
	public static void main(String[] args) {
		int javaScore = 90;
		int dateScore = 55;
		int engScore = 80;
		int aveScore = (javaScore+dateScore+engScore)/3;
		System.out.println("java成绩是"+retLevel(javaScore));
		System.out.println("数据库成绩是"+retLevel(dateScore));
		System.out.println("英语成绩是"+retLevel(engScore));
		System.out.println("平均成绩是"+aveScore);
	}
}
