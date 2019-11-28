package com.ty.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestE {

	public static void main(String[] args) {
		
        TreeMap<String, Integer> lh = new TreeMap<String,Integer>();
		
		lh.put("Patna", 880000);
		lh.put("Hariyana", 134203);
		lh.put("Banglore", 560068);
//		lh.put(null, 123456);
		
		System.out.println(lh);
		
		for(Map.Entry<String,Integer> m : lh.entrySet()) {
			Integer value = m.getValue();
			String key = m.getKey();
			
			System.out.println("Key is "+key);
			System.out.println("Value is "+value);
			
			System.out.println("============================");
		}
	}
}
