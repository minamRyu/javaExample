package day2;

public class Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 3;
		
//		if(num > 0) {
//			System.out.println("양수");
//		} else {
//			System.out.println("음수");
//		}
		// 위의 코드를 삼항 연산자로 표현하면
		
		String result = num > 0 ? "양수" : "음수";
		System.out.println(result);
		

	}

}
