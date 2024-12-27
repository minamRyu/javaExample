package day1;

public class Variable1 {

	public static void main(String[] args) {
		// Ctrl + Shift + F : 자동 들여쓰기
		String name = "홍길동";
		int stuNum = 20241226;
		int age; // integer(정수)
		age = 30;
		double height =170.5;
		boolean isSingle = true; //false
		
		// syso + Ctrl + Space : 출력 자동완성
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		
		age = 31;
		System.out.println(age);
		
		final double PI = 3.141592;		
//		PI = 3.14; // PI는 상수(final)라서 수정 불가
		
		// "홍길동의 나이는 31 입니다" 를 출력하시오
		System.out.println(name + "의 나이는 " + age + " 입니다.");
		
		

	}

}
