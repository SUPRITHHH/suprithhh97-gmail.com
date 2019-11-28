package com.ty.map;

import java.util.HashMap;

public class TestA {

	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		
		hm.put("KUKU", 9988014);
		hm.put("MALA", 678941);
		hm.put("Sheela", 78789);
		hm.put(null, 456789);
		         
		
		System.out.println("Data "+hm);
		hm.put("MALA", 123456);
		System.out.println("After Modify "+hm);
		hm.put("Dimple", 123456);
		System.out.println("After Dimple "+hm);
		
		System.out.println("After null "+hm);
		
		hm.put(null, 987654);
		
		System.out.println("After adding Dulicate null "+hm);
		
		Object o1  = hm.get("Sheela");
		
		System.out.println("Value "+o1);
		
		Object o2 = hm.get("Maya");
		
		System.out.println("Value of Maya "+o2);
		
		System.out.println("===========================");
		Object value = hm.remove("KUKU");
		System.out.println("After Remove----------->"+hm);
	}
}
