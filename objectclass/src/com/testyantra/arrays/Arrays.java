package com.testyantra.arrays;

public class Arrays {

	public static void main(String[] args) {
		int[] nums = new int[5];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		nums[4] = 50;
		
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		
		int[] nums1 = {10,20,30,40,50};
		System.out.println(nums1.length);
		
		for(int i : nums1) {
			System.out.println(i);
		}
		
		char[] ch = {'a','b','c','d'};
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		
		for(int c:ch) {
			System.out.println(c);
		}
		
		boolean[] b = {true,false,true,false};
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		
		for(boolean c1 : b) {
			System.out.println(c1);
		}
		
		byte[] b1= {10,20,30,40};
		for(int i=0;i<b1.length;i++) {
			System.out.println(b1[i]);
		}
		
		for(int a:b1) {
			System.out.println(a);
		}
		
		double[] d1 = {10.00,20.00,30.00,40.00,50.00};
		for(int i=0;i<d1.length;i++) {
			System.out.println(d1[i]);
		}
		
		for(double double1:d1) {
			System.out.println(double1);
		}
		
		String[] names = {"SUPRITH","MANU","WILLIAM","TRUMP"};
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		
		for(String c2:names) {
			System.out.println(c2);
		}
	}
}
