package day03;

import java.util.Scanner;

public class Loop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(;;) {} // 무한루프
		
//		while(true) { // 무한루프
//			System.out.println("무한루프!");
//		}
		
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		while(true) {
			System.out.println("메뉴 선택");
			System.out.println("(1) 덧셈 (2) 뺄셈 (3) 결과 (4) 프로그램 종료");
			int menu = scan.nextInt();
			if(menu == 1) {
				// 값을 입력받아서 sum에 더하기
				System.out.println("더할 숫자를 입력 : ");
				sum += scan.nextInt();
			} else if(menu == 2) {
				System.out.println("뺄 숫자를 입력 : ");
				// 값을 입력받아서 sum에 빼기
				sum -= scan.nextInt();
			} else if(menu == 3) {
				// sum에 있는 값 출력
				System.out.println("합계는 : " + sum);
			} else if(menu == 4) {
				// 프로그램 종료
				System.out.println("종료 되었습니다.");
				break;
			} else {
				System.out.println("1~4중 하나를 입력해주세요.");
			}
			
		}

	}

}
