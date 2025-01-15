package day02;

public class review {

	public static void main(String[] args) {
		String name = "홍길동";
		int age = 30;
		double height = 175.5;
		boolean isSingle = true;
		
		System.out.println(name);
		System.out.println(age + 1);
				
		age++; // age = age +1;
		
		int num1 = 10;
		int num2 = num1++;
		int num3 = ++num1;
		System.out.println(num1); //11
		System.out.println(num2); //11
		System.out.println(num3); //10

	}

}
