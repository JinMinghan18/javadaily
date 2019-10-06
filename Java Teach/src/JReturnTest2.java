public class JReturnTest2 
{
	public static void main(String[] args)
	{
		int a = getNumber();
		System.out.println("Hello");
		if(a>5)
			return;
		System.out.println("world");
	}
	
	public static int getNumber()
	{
		int number = 10;
		return number;
	}
}
