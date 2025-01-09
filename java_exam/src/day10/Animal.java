package day10;

public class Animal {
	private String name;
	private int age;
	private String sound; 
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
		this.sound = "소리";
	}
	
	public void info() {
		System.out.println("이름 : " + name + ", " + "나이 : " + age);
	}
	
	public void sound() {
		System.out.println(name + "이 " + sound + "를 냅니다.");
	}

}
