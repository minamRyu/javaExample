package day04;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 스캐너를 통해 숫자(양의 정수) 5개를 입력받고
		// 입력받은 수 중에서 가장 큰 수, 가장 작은 수,
		// 입력한 수들의 평균을 구하시오.
		Scanner scan = new Scanner(System.in);
		
		// 내가 푼거 수정 필요
//		int max = 0; // 가장 큰 수
//		int min = 0; // 가장 작은 수
//		int sum = 0; // 평균값
//		
//		System.out.println("숫자 5개를 입력하세요 : ");
//		int i =0;
//		while(i<5) {
//			int input = scan.nextInt(); // 입력받는 숫자
//			if(input < 0) {
//				System.out.println("양의 정수를 입력하세요.");
//				break;
//			} else {
//				min = input;
//				max = input > max ? input : max;
//				min = input < min ? input : min;
//				sum = sum + input;
//			}
//			i++;
//		}
//		System.out.println();
//		System.out.println("가장 큰 수는 : " + max);
//		System.out.println("가장 작은 수는 : " + min);
//		System.out.println("평균값은 : " + (sum/5));
		
		// 예제 풀이		
		int max = 0;
		int min = 0;
		int sum = 0;
		for(int i=1; i<=5; i++) {
			System.out.println(i + "번째 숫자 입력 : ");
			int input =scan.nextInt();
			sum += input;
			if (i==1) {
				max = input;
				min = input;
			} else {
				// 큰 수 갱신
				if(input > max) {
					max = input;
				} 
				// 작은 수 갱신
				if(input < min) {
					min = input;
				}
				
			}
			
		} 
		System.out.println("가장 큰 수 : " + max);
		System.out.println("가장 작은 수 : " + min);
		System.out.println("평균 : " + ((double)sum/5));

	}

}
