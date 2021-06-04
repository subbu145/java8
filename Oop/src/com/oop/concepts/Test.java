package com.oop.concepts;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1 = new Student(11, "rajuf");

		System.out.println(std1.getName());
		Student sid=std1.setId(14);
		Student sname=std1.setName("srinu");
		System.out.println(sid.getId());
		System.out.println(sname.getName());

	}

}
