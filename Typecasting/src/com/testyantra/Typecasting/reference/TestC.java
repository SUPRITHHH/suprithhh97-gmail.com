package com.testyantra.Typecasting.reference;

public class TestC {
public static void main(String[] args) {
	
	Pen p = new Marker();
	System.out.println(p.cost);
	p.write();
	Marker m = (Marker) p;
	System.out.println(m.size);
	System.out.println(m.cost);
	m.write();
	m.color();
	
}
}
