package javaReview;

public abstract class Animal { // abstract 를 붙이면 추상 클래스가 된다
	private String name;
	private int age;
	
	Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
	abstract void sound(); // 추상메소드는 아래처럼 구현불가
//	abstract void sound() {
//		System.out.println("소리를 낸다!");
//	}
	void eat() {
		System.out.println("먹는다!");
	}
	void sleep() {
		System.out.println("잔다!");
	}

}
