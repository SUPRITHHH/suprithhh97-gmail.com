package com.tyss.thread.properties;

public class MyPriorityThread extends Thread {

	public static void main(String[] args) {
		
		System.out.println("Main Started");
		int p = Thread.currentThread().getPriority();
		System.out.println("Main thread priority "+p);
		
		Thread.currentThread().setPriority(7);
		System.out.println("Main Thread priority "+Thread.currentThread().getPriority());
		
		 MyPriorityThread t = new MyPriorityThread();
		 int q = t.getPriority();
		 System.out.println("Majority thread priority "+q);
		 
		 t.setPriority(6);
		 System.out.println("Mypriority threadn priority "+t.getPriority());
		 
		 System.out.println("Main Ended");
	}
}
