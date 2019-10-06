public class JIfTest 
{
	public static void main(String[] args)
	{
		int englishScore = 90;
		int mathScore = 95;
		if(englishScore > 90) 
		{
			System.out.println("1、你的英语成绩优秀！");
		}
		else 
		{
			System.out.println("2、你的英语成绩合格！");
		}
		if(mathScore > 90)
		{
			System.out.println("2、你的数学成绩优秀！");			
		}
		if(englishScore > 90)
		{
			if(mathScore > 90)
			{
				System.out.println("3、你的数学和英语成绩都是优秀");
			}
			else System.out.println("3、你只有英语成绩是优秀");
		}
		else if (mathScore > 90)
		{
			System.out.println("3、你只有数学成绩是优秀！");
		}
		else 
			System.out.println("3、你的英语和数学成绩都是合格!");
		
	}

}
