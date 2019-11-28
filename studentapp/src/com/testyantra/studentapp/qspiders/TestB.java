package com.testyantra.studentapp.qspiders;

import static com.testyantra.studentapp.jspiders.Remote.*;//To  access Static Members 
//import static com.testyantra.studentapp.jspiders.Remote.on;
import com.testyantra.studentapp.jspiders.*;

public class TestB{
	public static void main(String[] args) {
		
		Remote r1 = new Remote();
		r1.on();
		Remote.off();
		System.out.println(Remote.num);
		
	
	}

}
