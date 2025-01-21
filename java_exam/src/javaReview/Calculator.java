package javaReview;

public interface Calculator { // 인터페이스 복습, abstract 를 안붙여도 추상클래스다
	// 인터페이스는 주석을 잘 정의해라, 인터페이스는 설계목적으로 만든다
	
	// 숫자 2개를 받아서 더한 후 리턴
	int sum(int x, int y);
	
	// 숫자 3개를 받아서 더한 후 리턴
	int sum(int x, int y, int z);
	
	// 숫자 2개를 받아서 곱한 후 리턴
	int multiple(int x, int y);
	
	// 숫자 2개를 받아서 나눈 후 리턴
	int divide(int x, int y);
	

}
