

 
import java.util.Scanner;
public class speaknumeral{
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String a = cin.nextLine();
		int length = a.length();
		char str = a.charAt(0);
		if(str == '-') {
			System.out.print("fu");
			for(int i=1;i<length;i++)
			{
				char Str = a.charAt(i);
				if(Str == '1') 		System.out.print(" yi");
				else if(Str =='2') 		System.out.print(" er");
				else if(Str == '3') 		System.out.print(" san");
				else if(Str == '4') 		System.out.print(" si");
				else if(Str == '5') 		System.out.print(" wu");
				else if(Str == '6') 		System.out.print(" liu");
				else if(Str == '7') 		System.out.print(" qi");
				else if(Str == '8') 		System.out.print(" ba");
				else if(Str == '9') 		System.out.print(" jiu");
				else System.out.print(" ling");
			}
		}
		else {
			char Str1 = a.charAt(0);
			if(Str1 == '1') 		System.out.print("yi");
			else if(Str1 == '2') 		System.out.print("er");
			else if(Str1 == '3') 		System.out.print("san");
			else if(Str1 == '4') 		System.out.print("si");
			else if(Str1 == '5') 		System.out.print("wu");
			else if(Str1 == '6') 		System.out.print("liu");
			else if(Str1 == '7') 		System.out.print("qi");
			else if(Str1 == '8') 		System.out.print("ba");
			else if(Str1 == '9') 		System.out.print("jiu");
			else System.out.print("ling");
			for(int i=1;i<length;i++)
			{
				char Str = a.charAt(i);
				if(Str == '1') 		System.out.print(" yi");
				else if(Str == '2') 		System.out.print(" er");
				else if(Str == '3') 		System.out.print(" san");
				else if(Str == '4') 		System.out.print(" si");
				else if(Str == '5') 		System.out.print(" wu");
				else if(Str == '6') 		System.out.print(" liu");
				else if(Str == '7') 		System.out.print(" qi");
				else if(Str == '8') 		System.out.print(" ba");
				else if(Str == '9') 		System.out.print(" jiu");
				else System.out.print(" ling");
			}
		}
	}
}