package com.testyantra.google;

public class TestA {

	public static void main(String[] args) {
		
		Browser b = new Browser();
		Google g = new Gmail();
		b.open(g);
		Google d = new Googledrive();
		b.open(d);
	}
}
