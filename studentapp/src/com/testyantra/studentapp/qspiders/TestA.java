package com.testyantra.studentapp.qspiders;

import com.testyantra.studentapp.jspiders.React;

//import com.testyantra.studentapp.jspiders.*;//It will import all the classes present in the package

public class TestA {

	public static void main(String[] args) {
		QTP q = new QTP();
		q.teachQTP();
		Selenium s1 = new Selenium();
		s1.teachSelenium();
		com.testyantra.studentapp.jspiders.Angular a1 = new com.testyantra.studentapp.jspiders.Angular();//this is one type
		a1.teachAngular();
		React r1 = new React();//this is another type
		r1.teachReact();
	}
}
