package day9.sub;

public interface Calculator {
	// 덧셈
	int sum(int x, int y); // interface에서는 abstract가 없어도 추상메소드
	// 뺄셈
	int sub(int x, int y);
	// 곱셈
	int mul(int x, int y);
	// 나눗셈
	int div(int x, int y);

}
