
public class JBooleanOperation 
{
	public static void main(String[] args)
	{
		int a = 10;
		if(a > 0 || (a/0>0))
			System.out.println("a大于0");
		else 
			System.out.println("a小于等于0");
	}

}
