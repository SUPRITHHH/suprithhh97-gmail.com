
public class TestA {

	public static void main(String[] args) {
		Pen p = new Pen();
		p.cost = 100;
		p.color = "RED";
		p.brand = "LINC";
		
		System.out.println("cost "+p.cost);
		System.out.println("color "+p.color);
		System.out.println("Brand "+p.brand);
		p.write();
		
		System.out.println("**************************************");
		
		Van v = new Van();
		v.cost = 900000;
		v.color="white";
		System.out.println("van cost "+v.cost);
		System.out.println("van color "+v.color);
		v.move();
		
		System.out.println("************************************");
		
		Van v1 = new Van();
		v1.cost=950000;
		v1.color="red";
		System.out.println("Van cost "+v1.cost);
		System.out.println("Van color "+v1.color);
	}
}

