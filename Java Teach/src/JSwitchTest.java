public class JSwitchTest 
{
	public static void main(String[] args)
	{
		int Score = 85;
		switch(Score/10)
		{
		case 10:
		case 9:
			System.out.println("成绩优秀");
			break;
		case 8:
			System.out.println("成绩良好");
			break;
		case 7:
			System.out.println("成绩中等");
			break;
		case 6:
			System.out.println("成绩合格");
			break;
		default:	
			System.out.println("成绩不合格");
			break;
		}
	}
}
