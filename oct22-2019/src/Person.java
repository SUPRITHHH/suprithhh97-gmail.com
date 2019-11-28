
public class Person {

	
	String name;
	int age;
	
	Person(String pname,int page){
		name = pname;
		age = page;
	}
	
	
	
	public static void main(String[] args) {
		Person p = new Person("Suprith",22);
		Person p1 = new Person("Pramod",19);
		Person p2 = new Person("Rony",22);
	}
}
