package com.testyantra.collectionframework;



public class TestT {

	public static void main(String[] args) {
		
		Student1 s1 = new Student1(1,"SURYA",78.99);
		Student1 s2 = new Student1(2,"YOLK",75.99);
		Student1 s3 = new Student1(3,"TREE",74.33);
		Student1 s4 = new Student1(4,"TREE1",75.33);
		Student1 s5 = new Student1(5,"TREE2",76.33);
		
		
		Student1[] students = new Student1[3];
		
		students[0]=s1;
		students[1]=s2;
		students[2]=s3;
		
		for(Student1 s:students) {
			System.out.println(s);
		}
	}
}
