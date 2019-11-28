package com.testyantra.sorting.list;

public class Student implements Comparable<Student> {

	int id;
	String name;
	double percentage;
	
	public Student(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	
//                      To sort based on Id
	
//	@Override
//	public int compareTo(Student s) {
//		if(this.id>s.id) {
//			return 1;
//		}else if(this.id<s.id){
//			return -1;
//		}else {
//		return 0;
//		}
//	}
	
//   Sorting Based on Percentage	
//	@Override
//	public int compareTo(Student s) {
//		if(this.percentage>s.percentage) {
//			return 1;
//		}else if(this.percentage<s.percentage) {
//			return -1;
//		}else {
//			return 0;	
//		}
//		
//	}
	
	String s1;
	
	@Override
	public int compareTo(Student s) {
	
		String p = this.name.toLowerCase();
		String q = s.name.toLowerCase();
//		return p.compareToIgnoreCase(q);
		return p.compareTo(q);
	    
	
	}
	
//	@Override
//	public int compareTo(Student s) {
//	
//		Integer p = this.id;
//		Integer q = s.id;
//
//		return p.compareTo(q);
//}

}