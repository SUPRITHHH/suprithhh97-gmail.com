
public class Student1 {

	String name;
	int USN;
	String email;
	int mobileno;
	String branch;

	public Student1(String name,int USN,String email,int mobileno,String branch) {
		this.name = name;
		this.USN = USN;
		this.email=email;
		this.mobileno=mobileno;
		this.branch=branch;
	}

	void sayHello() {
		System.out.println("Name "+name+" USN "+USN+" email "+email+" Mobilenumber "+mobileno+" Branch " +branch); 

	}
	void printDetails() {
		System.out.println("Student name is "+name);
		System.out.println("Student USN is "+ USN);
		System.out.println("Student email is "+email);
		System.out.println("Student Mobile Number is "+mobileno);
		System.out.println("Student Branch is "+branch);
		this.sayHello();
	}

	public static void main(String[] args) {

		Student1 e1 = new Student1("Suprith",143,"abc@gmail.com",123,"EC");
		e1.printDetails();

		Student1 e2 = new Student1("Pramod",123,"def@gmail.com",456,"CS");
		e2.printDetails();

		Student1 e3 = new Student1("Suraj",456,"ghi@gmail.com",789,"CS");
		e3.printDetails();

		Student1 e4 = new Student1("Santosh",789,"jkl@gmail.com",101,"ME");
		e4.printDetails();

		Student1 e5 = new Student1("Shreenivas",101,"mno@gmail.com",102,"CE");
		e5.printDetails();

		Student1 e6 = new Student1("Reddy",102,"pqr@gmail.com",103,"EC");
		e6.printDetails();

		Student1 e7 = new Student1("Varun",103,"stu@gmail.com",104,"EE");
		e7.printDetails();

		Student1 e8 = new Student1("Swaroop",104,"vwz@gmail.com",105,"EE");
		e8.printDetails();

		Student1 e9 = new Student1("Gagan",105,"srs@gmail.com",106,"TE");
		e9.printDetails();

		Student1 e10 = new Student1("Tarun",107,"vtu@gmail.com",108,"IS");
		e10.printDetails();

	}



}

