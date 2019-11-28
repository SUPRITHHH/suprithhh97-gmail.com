package com.testyantra.objectclass;

public class TestB {
	
	public static void main(String[] args) {
		
		Pen p1 = new Pen();
		int pHashcode = p1.hashCode();
		System.out.println("HashCode of P "+pHashcode);
		
		Pen q = new Pen();
		int qHashcode = q.hashCode();
		System.out.println("HashCode of q "+qHashcode);
	}

}
