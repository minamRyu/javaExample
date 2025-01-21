package javaReview;

public class Pig extends Animal{ // Animal 중 sound가 추상 메서드 이므로 오버라이딩를 해야한다

	Pig(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	@Override
		void sound() {
			// TODO Auto-generated method stub
			System.out.println("꿀꿀!");
		}


}
