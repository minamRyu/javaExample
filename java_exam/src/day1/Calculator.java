package day1;

public class Calculator {

	public static void main(String[] args) {
		int x = 10;
		int y = 3;
		int z = x/y;  // int z = 10/3; 와 같다
		// 정수(int)간의 나눗셈은 결과가 정수로 나온다. 소숫점 삭제
		// 하나라도 실수(double)이면 결과가 실수로 나온다.
		
		System.out.println(x + 10);
		System.out.println(y * 20);
		System.out.println(z);
		System.out.println(x + y);
		
		System.out.println(x);	// 10출력
		System.out.println("x");	// x 출력
		
		System.out.println("x + y = " + (x + y));	// 문자열과 정수를 더하면 문자열이 된다. 정수 부분을 괄호로 묶으면 연산됨
		
		int num1 = 10;
		num1 = (int) 12.5; // Add cast 설정으로 int에 저장가능. 단 소숫점 삭제되고 12만 입력.
		int num2 = 3;
		double num3 = 3.5;
		num3 = 10;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
	}

}
