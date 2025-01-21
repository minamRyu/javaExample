package javaReTest;

import java.util.ArrayList;
import java.util.HashMap;

public class Student extends Human{
	String stuNo;

	public Student(String name, int age, String stuNo) {
		// TODO Auto-generated constructor stub
		super(name, age);
		this.stuNo = stuNo;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	ArrayList<String> subjectList() {
		ArrayList<String> list = new ArrayList<>();
		list.add("자바");
		list.add("오라클");
		list.add("HTML");
		return list;
	}
}
