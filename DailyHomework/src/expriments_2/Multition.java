package expriments_2;

import java.util.Random;

public class Multition {
	private static final int count = 10;
	public static Multition[] list= new Multition[count];
	public static int n = 0;
	private int num;
	
	private Multition(){
		num = 0;
	}
 
	private Multition(int a){
		num = a;
	}
	
	public static Multition getInstance(){
		int tmp = n;
		n++;		
		if (n > count) n = 0;
		list[tmp] = new Multition();
		return list[tmp];
	}

	
	public static Multition getRandomInstance(){
		Random r = new Random();
		int c = r.nextInt(count);
		if (list[c] == null){
			list[c] = new Multition();
		}
		return list[c]; 
	}
	
	public int getNum()
	{
		return num;
	}
	
	public void setNum(int a)
	{
		num = a;
	}
	
	public static void main(String[] args)
	{
		Multition t = Multition.getInstance();
		t.setNum(5);
		System.out.println(t.getNum());
		t = Multition.getRandomInstance();
		System.out.println(t.getNum());
	}
}
