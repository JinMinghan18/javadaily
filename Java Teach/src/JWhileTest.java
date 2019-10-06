public class JWhileTest 
{
	public static void main(String[] args)
	{
		int i,sum;
		sum = 0;
		i = 1;
		while(i<=100)
		{
			sum+=i;
			i++;
		}
		System.out.println("sum = "+sum);
	}
}
