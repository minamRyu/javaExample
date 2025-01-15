package day04;

import java.util.Random;
import java.util.Scanner;

public class Quiz_ryu {

	public static void main(String[] args) {
		
		// 1번 문제
		System.out.println("1번 문제");
		String name = "홍길동";
		int age = 30;
		String addr = "인천";
		System.out.println(name + "의 나이는 " + age + ", 주소는 " + addr + "입니다.");
		System.out.println();
		
		// 2번 문제
		System.out.println("2번 문제");
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = scan.nextInt();
		if(num >= 50) {
			System.out.println("50 이상 입니다.");
		} else {
			System.out.println("50 미만 입니다.");
		}
		System.out.println();
		
		// 3번 문제
		System.out.println("3번 문제");
		System.out.print("홀짝 테스트 : ");
		int oddEven = scan.nextInt();
		if(oddEven <= 0) {
			System.out.println("계산할 수 없습니다.");
		} else if(oddEven >= 11) {
			System.out.println("계산할 수 없습니다.");
		} else {
			if(oddEven %2 == 1) {
				System.out.println("홀수");
			} else {
				System.out.println("짝수");
			}
		}
		System.out.println();
		
		// 4번 문제
		System.out.println("4번 문제");
		System.out.print("구구단 : ");
		int gugu = scan.nextInt();
		for(int i=0; i<=9; i++) {
			System.out.print(gugu + " * " + i + " = " + (gugu*i));
			System.out.print('\t');
		}
		System.out.println();
		System.out.println();
		
		// 5번 문제
		System.out.println("5번 문제");
		for(int j=1; j<=30; j++) {
			if(j<10) {
				System.out.print(j);
				System.out.print('\t');
			} else if(j>=20) {
				System.out.print(j);
				System.out.print('\t');
			}
		}
		System.out.println();
		System.out.println();
		
		// 6번 문제
		System.out.println("6번 문제");
		for(int k=2; k<=9; k++) {
			if(k != 5) {
				if(k != 8) {
					System.out.println("====== " + k + "단 ======");
					for(int l=1; l<=9; l++) { 
						System.out.println(k + " * " + l + " = " + k*l );
					}
					System.out.println();
				}
				
			}
			
		}
		System.out.println();
		
		// 7번 문제
		System.out.println("7번 문제");
		Random ran = new Random();
		int gameNum = ran.nextInt(99)+1;
		int count = 1;
		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			int answer = scan.nextInt();
			if(gameNum > answer) {
				System.out.println("UP!");
				count++;
				System.out.println();
			} else if(gameNum < answer) {
				System.out.println("DOWN!");
				count++;
				System.out.println();
			} else if(gameNum == answer){
				System.out.println("정답입니다.");
				System.out.println(count + "번 만에 맞추셨습니다.");
				break;
			}	
		}

	}

}
