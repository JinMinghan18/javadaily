package nice;

public class JFinalBook {
	public final int bookID;
	public static int bookNumber = 1;
	
	public JFinalBook() {
		bookID = bookNumber++;
	}
	
	public long getID() {
		return bookID;
	}
	
	public static void main(String[] args) {
		JFinalBook[] s = new JFinalBook[5];
			for(int i=0;i<s.length;i++) {
				s[i] = new JFinalBook();
				System.out.println("The bookID is "+s[i].getID());
			}
	}
}
