package day10;

public class Sample {
	String name;
	int age;
	
	Sample(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Sample obj() { // 메소드명 obj앞에는 리턴 type이 붙어야 한다. 예로 int, String 등
		return this; // 내 객체에 주소를 리턴한다
	}
}
