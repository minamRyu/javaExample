package javaReTest;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		   2. 1부터 100까지 숫자 중 홀수이거나 8의 배수인 숫자를 출력하시오.
//		   단, 50~60까지의 숫자를 출력하지 마시오.
		for(int i=1; i<=100; i++) {
			if((i%2==1) || (i%8 == 0) ) {
				if(i<50 || i>60) {
					System.out.print(" " + i);
				}
			}
		}
	}
}
