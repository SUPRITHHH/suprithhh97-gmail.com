package com.ty.map;

import java.util.Hashtable;

public class TestH {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht = new Hashtable<Integer,String>();
		ht.put(101, "ajay");
		ht.put(102, "vijay");
		ht.put(100, "Sonu");
		ht.put(99, "monu");
		ht.put(101, "Sriram");
//		ht.put(null, "John");Null Pointer Exception
//		ht.put(108, null);
		
		
		System.out.println("Data "+ht);
	}
}
