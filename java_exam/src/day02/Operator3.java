package day02;

public class Operator3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 5;
		int num3 = 10;
		System.out.println(num1 > num2);
		System.out.println(num1 < num2);
		System.out.println(num1 >= num3);
		System.out.println(num1 == num2);
		System.out.println(num1 != num2); // !는 부정의 의미로 많이 쓰임. 같지 않다
		System.out.println();
		
		boolean temp = true;
		System.out.println(temp);
		System.out.println(!temp);
		System.out.println(!(num1 > num2));
		System.out.println();
		
		System.out.println(num1 > num2 && num1 >= num3); // &&는 and 연산자
		System.out.println(true && true); //true
		System.out.println(true && false); //false
		System.out.println(false && true); //false
		System.out.println(false && false); //false
		System.out.println();
		
		System.out.println(true || true); //true
		System.out.println(true || false); //true
		System.out.println(false || true); //true
		System.out.println(false || false); //false
		System.out.println();
		
		
		

	}

}
