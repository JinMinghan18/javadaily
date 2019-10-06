public class JDoWhileTest 
{
	public static void main(String[] args)
	{
		int i,sum;
		i = 101;
		sum = 0;
		do {
			sum+=i;
			i++;
		}while(i<=100);
		System.out.println("sum = "+ sum);
	}

}
