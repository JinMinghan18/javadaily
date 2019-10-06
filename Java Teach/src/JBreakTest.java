public class JBreakTest 
{
	public static void main(String[] args)
	{
		int index = 0;
		while(index <= 100)
		{
			index += 10;
			if(index == 40)
				break;
			System.out.println("The index is "+index);
		}
	}
}
