
public class Subclass extends Superclass {

	String s = "subclass variable";
	Subclass(){
	     super();
		System.out.println("Sub class constructor");
	}
	
	void getSData() {
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(super.s);
		super.superClassMethod();
	}
}
