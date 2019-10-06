public class JContinueTest2 
{
	public static void main(String[] args)
	{
		int i,index=0;
		tag1:
		for(i=1;i<3;i++)
		{
			while(index<=90)
			{
				index+=10;
				if(index == 40)
				continue tag1;
				System.out.println("The index is "+index);
			}
			System.out.println("for语句循环次数"+i);
		}
	}
}
