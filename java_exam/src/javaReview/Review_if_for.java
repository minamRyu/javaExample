package javaReview;

public class Review_if_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num1 = 10;
//		int num2 = 20;
//		int num3 = 30;
//		int num4 = num1 > num2 ? num1 : num2; // 삼항연산자 많이쓰인다. 외워둘것
		
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.print(i + " * " + j + " = " + i*j + "\t");
				if(j==9) {
					System.out.println();
				}
			}
		}
	}

}
