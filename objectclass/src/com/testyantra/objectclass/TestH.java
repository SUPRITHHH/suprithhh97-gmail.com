package com.testyantra.objectclass;

public class TestH {

	public static void main(String[] args) throws CloneNotSupportedException {
		Person p = new Person(10,"SUPRITH");
		System.out.println("p1 id "+p.id);
		System.out.println("p1 name "+p.name);
		
		Object obj = p.clone();
		Person p2 = (Person)obj;
		System.out.println("p2 id is "+p2.id);
		System.out.println("p2 name is "+p2.name);
		p2.id=20;
		p2.name="NEENU";
		
		System.out.println("___________AfterCloning__________");
		System.out.println("p2 id is "+p.id);
		System.out.println("p2 name is "+p.name);
		System.out.println("p2 id is "+p2.id);
		System.out.println("p2 name is "+p2.name);
	}
}
