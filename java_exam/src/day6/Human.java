package day6;

public class Human {
	String name;
	int age;
	String addr;
	
	Human(String name, int age, String addr) { // 생성자 선언. 클래스 이름과 동일한 메소드를 만든다. void, public 등 없다. 리턴 값이 없다. 객체가 생성될 때 반드시 호출됨.
		this.name = name; // this를 붙이면 위의 본연값을 말하고, 뒤의 name는 메소드의 파라메터
		this.age = age;
		this.addr = addr; 
	} 
	Human(String name, int age) {
		this(name, age, "알 수 없음"); // this 생성자는 맨 첫줄에 작성해야한다!!
//		this.name = name;
//		this.age = age;
//		this.addr = "알수없음"; 
	}
	
	void study() {
		System.out.println("공부를 합니다.");
	}
	String eat(String food) {
		return food + "를(을) 먹습니다.";
	}

}
