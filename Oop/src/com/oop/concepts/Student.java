package com.oop.concepts;

public final class Student {
	
	private Integer id;
	private String name;
	
	public Student setId(Integer id) {
	
		return new Student(id, null);
	}
	public Student setName(String name) {
		
		return new Student(null, name);
	}
	
	public Student(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
}
