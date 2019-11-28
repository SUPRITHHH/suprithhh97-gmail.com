package com.testyantra.arrays;

public class TestB {

	public static void main(String[] args) {
		
		int[] nums2 = {10,20,30,40,50};
		
//		System.out.println(nums2[20]);Array IndexOut Bound Exception
		receive(nums2);
		int[] values = getArray();
		for(int i : values) {
			System.out.println(i);
		}
		
	
		String[] name = {"SUPRITH","VEENA"};
		receiveArray(name);
		
		String[] tree = getString();
		for(String s4 : tree) {
			System.out.println(s4);
		}
		
	}
	static void receive(int[] nums3) {
	
		for(int num : nums3) {
			System.out.println(num);
		}
		
	}
	
	static int[] getArray() {
		int[] values = {10,20,30,40,50};
		return values;
	}
	
	static void receiveArray(String[] s1) {
		
		for(String s2 : s1) {
			System.out.println(s2);
		}
	}
	
	static String[] getString() {
		String[] s3 = {"TREE","TREE1"};
		return s3;
	}
	
	
	
	
   }
