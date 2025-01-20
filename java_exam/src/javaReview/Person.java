package javaReview;

public class Person {
	private String name;
	private int age;
	private String mbti;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	// 음식명을 매개변수로 받아서 음식을 먹는다는 메서드 작성
	void eat(String food) {
		System.out.println(food + "를 먹는다.");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + "의 mabti는 " + mbti + " 입니다.";
	}
	
	void setMbti(String mbti) {
		this.mbti = mbti;
	}

	public String getMbti() {
		return mbti;
	}
}
