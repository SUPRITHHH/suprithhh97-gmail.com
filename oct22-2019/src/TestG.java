
public class TestG {
	
	
	  final void add() {
		  System.out.println("add() method");
	  }
	  
	  final void add(int a) {
		  System.out.println("add(int a) method");
	  }

	public static void main(String[] args) {
	
		
		
		final 
		Superclass s1 = new Superclass();
		Subclass s2 = new Subclass();
		s2.getSData();
		
		TestG f1 = new TestG();
		f1.add();
		f1.add(10);
	}
	
}
