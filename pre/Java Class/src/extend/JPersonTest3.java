package extend;

class JPerson3{
	int personId;
	
	public JPerson3(int i) {
		personId = i;
		System.out.println("现在personId的值是"+personId);
		
	}
	
	public JPerson3(int i,int j) {
		System.out.println("现在personId的值是"+personId);
	}

}


class JSubPerson3 extends JPerson3{
	public JSubPerson3(int i) {
		super(i);
		System.out.println("现在personId的值是"+personId);
	}
	
}

public class JPersonTest3{
	public static void main(String[] args) {
		JSubPerson3 j3 = new JSubPerson3(100);
	}
}