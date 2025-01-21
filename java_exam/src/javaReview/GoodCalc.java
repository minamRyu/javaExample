package javaReview;

public class GoodCalc implements Calculator{ // 인터페이스는 구현 할때 implements 를 쓴다
//	 GoodCalc 선택후 자동으로 오버라이딩 하면 편하다
	
	@Override
	public int sum(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public int sum(int x, int y, int z) {
		// TODO Auto-generated method stub
		return x+y+z;
	}

	@Override
	public int multiple(int x, int y) {
		// TODO Auto-generated method stub
		return x*y;
	}

	@Override
	public int divide(int x, int y) {
		// TODO Auto-generated method stub
		int z = 0;
		try {
			z = x/y;
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return z;
	} 
	
	// 숫자 2개를 받아서 큰 수를 리턴해주는 함수
	// 함수명은 max, 리턴, 매개변수는 모두 int
	public int max(int x, int y) {
//		if(x>y) {
//			return x;
//		} else {
//			return y;
//		}
		return x > y ? x : y; // 3항 연산자로 깔금하게!!!
	}
}
