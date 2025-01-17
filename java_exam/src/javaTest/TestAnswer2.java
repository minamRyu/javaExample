package javaTest;

public class TestAnswer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int enen = 0;
		int fiveNum = 0;
		int sum = 0;
		for(int i=1; i*5<=100; i++) {
			if(i%2 == 0) {
				fiveNum = i*5;
				sum += fiveNum;
			}
		}
		System.out.println("정답은 : " + sum + "입니다.");
	}
}
