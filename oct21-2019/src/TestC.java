
public class TestC {

	public static void main(String[] args) {
		Person p = new Person();
		p.name ="Suprith";
		p.age=22;
		p.color="Black";
		System.out.println("Person Name is "+p.name);
		System.out.println("Person Age is "+p.age);
		System.out.println("Person color is "+p.color);
		p.eat();
		p.walk();
		p.sleep();
		
		System.out.println("*******************************");
		Person.color="White";
		Person.sleep();
		System.out.println(Person.color);
		
	    System.out.println("**********************************");
	
	    Person p1 = new Person();
	    p1.name ="Pramod";
		p1.age=19;
		System.out.println("Person Name is "+p1.name);
		System.out.println("Person Age is "+p1.age);
	
	
	}
	
}
