package com.tyss.thread.properties;

public class MyIdThread extends Thread {

	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
		System.out.println(Thread.currentThread().getId());
		
		MyIdThread mi = new MyIdThread();
		System.out.println("MyIdThread "+mi.getId());
		
		System.out.println("Priority "+Thread.currentThread().getPriority());
		
//		Thread.currentThread().setPriority(12);ILLegalArgumentException
		
	    System.out.println("Main Ended");
	}
}
