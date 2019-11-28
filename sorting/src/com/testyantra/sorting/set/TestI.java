package com.testyantra.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestI {

	public static void main(String[] args) {
		
		//		SortByName sb = new SortByName();
		//SortByPinCode sp = new SortByPinCode();
		SortByMicr sm = new SortByMicr();
		TreeSet<Bank> ts = new TreeSet<Bank>(sm);
		
		
		
		
		Bank b1 = new Bank("HDFC",560068,6768689);
		Bank b2 = new Bank("SBI", 560071, 9898989);
		Bank b3 = new Bank("CITI", 560054, 765678);
		Bank b4 = new Bank("CANARA", 560076, 123456);
		Bank b6 = new Bank("CANARA", 560076, 123456);
		
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		ts.add(b6);
		
		System.out.println("*********Using Iterator***********");
		
		Iterator<Bank> it = ts.iterator();
		while(it.hasNext()) {
			Bank b5 = it.next();
			System.out.println("Name is "+b5.name);
			System.out.println("PinCode is "+b5.pincode);
			System.out.println("MICR is "+b5.micr);
			System.out.println("==============================");
		}
	}
}
