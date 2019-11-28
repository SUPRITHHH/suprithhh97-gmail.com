
public class Employee1 {

	String name;
	int eid;
	
	public Employee1(String name,int eid) {
		this.name = name;
		this.eid = eid;
	}
	
	void sayHello() {
		System.out.println("Hello "+name+" Welcome to Test Yantra"); 
		
	}
	void printDetails() {
		System.out.println("Employee name is "+name);
		System.out.println("Employee Id is "+eid);
		this.sayHello();
	}
	
	public static void main(String[] args) {
		
		Employee1 e1 = new Employee1("Suprith",143);
		e1.printDetails();
		
		Employee1 e2 = new Employee1("Pramod",520);
		e2.printDetails();
		
		Employee1 e3 = new Employee1("Veena",620);
		e3.printDetails();
	}
}
