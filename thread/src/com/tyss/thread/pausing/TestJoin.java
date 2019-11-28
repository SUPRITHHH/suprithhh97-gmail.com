package com.tyss.thread.pausing;

public class TestJoin {

	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
		MyJoinThread t = new MyJoinThread();
		
		t.start();
		try {
			t.join(10);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
		
		System.out.println("Main Ended");
	}
}
