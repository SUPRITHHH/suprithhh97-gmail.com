package com.testyantra.accessmodifier.pkg1;

import com.testyantra.accessmodifier.pkg2.Demo;

public class Sample extends Demo{
	
	public static void main(String[] args) {
		
		Demo d = new Demo();
//      Private
		
//		System.out.println(d.a);
//		d.add(;)
		
		//Default
		//System.out.println(d.b);
		//d.sub();
		Sample s1 = new Sample();
		//Protected
		System.out.println(s1.c);
		s1.mul();
		//public
		System.out.println(d.name);
		d.div();
	
	
	}

}
