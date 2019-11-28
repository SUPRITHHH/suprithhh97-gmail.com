package com.ty.map;

import java.util.HashMap;

public class TestB {

	public static void main(String[] args) {
		

		HashMap hm = new HashMap();
		
		hm.put("KUKU", 9988014);
		hm.put("MALA", 678941);
		hm.put("Sheela", 78789);
		
		HashMap hm1 = new HashMap<>();
		
		hm1.put("Deepu", 789099);
		hm1.put("Riya", 678909);
		hm1.put("Kirti", 467787);
		
		boolean hasKey = hm.containsKey("MALA");
		System.out.println("Has a key "+hasKey);
		
		boolean hasKey1 = hm.containsKey("Maya");
		System.out.println("Has Value "+hasKey1);
		
		boolean hasKey2 = hm.containsKey(78945212);
		System.out.println("Has Value "+hasKey2);
		
		hm.putAll(hm1);
		
		System.out.println("==================================");
		System.out.println("After put all "+hm);
		
		System.out.println(hm.size());
		
		boolean isEmpty = hm.isEmpty();
		System.out.println("Map is empty "+isEmpty);
		
		hm.clear();
		System.out.println("After clear "+hm);
		
		
	}
}
