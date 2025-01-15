package day02;

import java.util.Scanner;

public class Loop6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// test : 사용자가 스캐너로 입력받아서
		// 1부터 입력받은 숫자까지의
		// 홀수들의 합, 짝수들의 합 구하기
		// 홀수의 합 ; 000 , 짝수의 합:000
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = scan.nextInt();
		int oddSum = 0;
		int evenSum = 0;
		for(int i=0; i<=num; i++) {
			if(i%2 == 1) {
				oddSum += i;				
			} else {
				evenSum += i;
			}
		}		
		System.out.println("홀수들의 합 : " + oddSum);
		System.out.println("짝수들의 합 : " + evenSum);	
	}

}
