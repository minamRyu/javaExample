package day4;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 스캐너를 통해 숫자 5개를 입력받고
		//가장 작은 수를 구하시오.
		
		Scanner scan = new Scanner(System.in);
		
		// 내가 푼것. 동작은 함
//		int min = 0;
//		for(int i=1; i<=5; i++) {
//			System.out.print(i + "번째 숫자를 넣으세요 : ");
//			int input = scan.nextInt();
//			if(i==1) {
//				min = input;
//			}
//			min = Math.min(min, input);
//		}
//		System.out.println("가장 작은 수는 : " + min + "입니다.");
		
		// 예제 풀이
		int min = 0;
		for(int i=1; i<=5; i++) {
			System.out.print(i + "번째 숫자를 넣으세요 : ");
			int input = scan.nextInt();
			if(i==1) {
				min = input;
				continue;
			}
			min = min > input ? input : min;
		}
		System.out.println("가장 작은 수는 : " + min + "입니다.");

	}

}
