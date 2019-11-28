package com.testyantra.sorting.list;

public class Laptop implements Comparable<Laptop>{
	
	double price;
	int ram;
	String name;
	
	public Laptop(double price, int ram, String name) {
		super();
		this.price = price;
		this.ram = ram;
		this.name = name;
	}
	
//	@Override
//	public int compareTo(Laptop s) {
//		if(this.ram>s.ram) {
//			return 1;
//		}else if(this.ram<s.ram) {
//			return -1;
//		}else {
//		return 0;
//		}
//	}
	
//	@Override
//	public int compareTo(Laptop s) {
//		if(this.price>s.price) {
//			return 1;
//		}else if(this.price<s.price) {
//			return -1;
//		}else {
//		return 0;
//		}
//	}
	
	@Override
	public int compareTo(Laptop s) {
		String s1 = this.name;
		String s2 = s.name;
		return s1.compareTo(s2);
	}
	
	
	

}
