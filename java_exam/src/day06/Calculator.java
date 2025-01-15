package day06;

public class Calculator {
	
	void sum(int x, int y) {
		System.out.println("두 수의 합은 = " + (x+y));
	}
	int sum2(int x, int y) { // 여기서 int는 return type
		int a = x+y;
		return a;
	}
	
	int multiple(int x, int y) {
		return x*y;
	}
	
	double multiple(int x, double y) {
		return x*y;
	}
	
	int multiple(int x, int y, int z) { // 동일 이름으로 오버로딩 가능 단, 매개변수 개수, 타입은 다르게
		return x*y*z;
	}

}
