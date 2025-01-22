package javaReTest;

import java.util.ArrayList;
import java.util.HashMap;

public class Student extends Human{
	private String stuNo;

	public Student(String name, int age, String stuNo) {
		// TODO Auto-generated constructor stub
		super(name, age);
		this.stuNo = stuNo;
	}

//	부모 클래스만 잘 상속 받았으면 아래 코드는 없어도 된다
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return super.toString();
//	}
	
	ArrayList<String> subjectList() {
		ArrayList<String> list = new ArrayList<>();
		list.add("자바");
		list.add("오라클");
		list.add("HTML");
		return list;
	}
}
