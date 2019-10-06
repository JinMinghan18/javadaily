package nice;

public class JBook 
{
	public int id;
	public static int bookNumber = 0;
	
	public JBook()
	{
		++bookNumber;
	}
	
	public void info() 
	{
		System.out.println("当前书的编号是: " +id);
	}
	
	public static void infostatic()
	{
		System.out.println("书的总数是: "+bookNumber);
	}
	
	public static void main(String args[])
	{
		JBook a = new JBook();
		JBook b = new JBook();
		a.id = 1101;
		b.id = 1234;
		System.out.println("变量a对应的");
		a.info();
		System.out.println("变量b对应的");
		b.info();
		JBook.infostatic();
		System.out.println("比较(a.bookNumber == JBook.bookNumber)"+"的结果是："
		+(a.bookNumber == JBook.bookNumber));
		System.out.println("比较(b.bookNumber == JBook.bookNumber)"+"的结果是："
		+(b.bookNumber == JBook.bookNumber));
	}
}
