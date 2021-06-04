package com.oop.concepts1;

import com.oop.concepts.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std = new Student(15,"kalyan");
		System.out.println(std.getName());
		Student s =std.setId(16);
		Student s1= std.setName("prasad");
		System.out.println(s1.getName());
		System.out.println(s.getId());

	}

}
