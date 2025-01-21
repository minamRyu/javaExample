package javaReview;

import java.util.HashMap;

public class Student extends Person{
	
	private String stuNo;
	private int grade;

	Student(String name, int age, String stuNo, int grade) {
		super(name, age);
		this.stuNo = stuNo;
		this.grade = grade;
		// TODO Auto-generated constructor stub
	}
	
@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = super.toString() + "\n학번은 " + stuNo + ", 학년은 " + grade + "학년 입니다.";
		return str;
	}
	
	String study(String subject) {
		return subject + "는 재밌다!";
	}
	
	HashMap<String, Object> getInfo() {
		HashMap<String, Object> map = new HashMap<>();
		map.put("stuNo", stuNo);
		map.put("grade", grade);
		return map;
	}
	
//	void temp() {
//		for(int i=0; i<100; i++) {
//			if(i>50) {
//				return; // return을 만나는 순간 메서드를 빠져나간다
////				break;  // break는 반복문만 빠져나간다
//			}
//			System.out.println(i);
//		}
//		System.out.println("test1");
//		System.out.println("test2");
//		System.out.println("test3");
//	}
	
}
