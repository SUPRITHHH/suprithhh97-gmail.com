
public class TestC {

	public static void main(String[] args) {
		Superclass s = new Superclass();
		s.count();
		System.out.println("_________________________________");
		
		Subclass s1 = new Subclass();
		s1.count();
		s1.add();
		System.out.println("__________________________________");
		
		
		
	}
}
