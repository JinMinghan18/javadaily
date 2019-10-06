public class JContinueTest 
{
	public static void main(String[] args)
	{
		int index = 0;
		while(index<=90)
		{
			index += 10;
			if(index == 40)
			continue;
			System.out.println("The index is "+ index);
		}
	}
}
