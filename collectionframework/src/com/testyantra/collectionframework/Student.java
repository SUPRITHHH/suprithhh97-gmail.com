package com.testyantra.collectionframework;

public class Student {

	private final int id;
	private final String name;
	private final double percentage;
	
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	}



	public Student(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}



	public int getId() {
		return id;
	}



	public String getName() {
		return name;
	}



	public double getPercentage() {
		return percentage;
	}
	
	
	
	
}
