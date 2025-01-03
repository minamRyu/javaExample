package day6;

public class CalcuMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		calc.sum(3, 5);
		int a = calc.sum2(3, 5);
//		System.out.println(calc.sum2(3, 5));
		System.out.println("합 : " + a);
		System.out.println("sum : " + a);
		
		// 예제
		int b = calc.multiple(5, 2, 3);
		System.out.println(b);
		
		int c = calc.multiple(10, 20);
		System.out.println(c);
		
		double d = calc.multiple(5, 7.5);
		System.out.println(d);
	}

}
