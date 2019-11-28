package com.testyantra.collectionframework;

public class Teacher {
	

	private final int id;
	private final String name;
	private final String subject;
	
	public Teacher(int id, String name, String subject) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", subject=" + subject + "]";
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSubject() {
		return subject;
	}
	
	
	
	

}
