
public class Employee {

	String name;
	int eid;
	
	public Employee(String ename,int empid) {
		name = ename;
		eid = empid;
	}
	
	void printDetails() {
		System.out.println("Employee name is "+name);
		System.out.println("Employee Id is "+eid);
	}
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("Suprith",143);
		e1.printDetails();
		
		Employee e2 = new Employee("Pramod",520);
		e2.printDetails();
		
		Employee e3 = new Employee("Veena",620);
		e3.printDetails();
	}
}
