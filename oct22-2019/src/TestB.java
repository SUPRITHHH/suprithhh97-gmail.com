
public class TestB {
	
      static int a=25;
      static TestB t;
       int x;
	public static void add() {
		//only final access modifier is supported for local variables
		final int a;
		int b;
		a=10;
		b=20;
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		add();
		TestB b = new TestB();
		System.out.println("x value is "+b.x);
	}

}
