
public class TestH {

	public static void main(String[] args) {

		System.out.println("********Dog*********");
		Dog d1 = new Dog();
		d1.eat();
		d1.bark();
		System.out.println("********Lion*********");
		Lion l1 = new Lion();
		l1.eat();
		l1.roar();

		System.out.println("*******Animal*********");
		Animal a1 = new Animal();
		a1.eat();
	}
}
