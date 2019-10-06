
public class JStringEqual 
{
	public static void main(String[] args)
	{
		String str1 = new String("welcome");
		String str2 = new String("welcome");
		String str3 = str1;
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
	}
}
