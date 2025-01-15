package day03;

import java.util.Random;
import java.util.Scanner;

public class RandomGuGudan3 {

	public static void main(String[] args) {
		
		Random ran = new Random(); // Random 숫자 만들기
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int correct = 0; // 정답 개수
			System.out.println("문제 수를 입력해주세요. 0이하 숫자 입력 시 종료됩니다.");
			int count = scan.nextInt();
			if(count == 0) {
				System.out.println("종료 되었습니다.");
				break;
			} else {
				for(int i=1; i<=count; i++) {
					int x = ran.nextInt(8)+2; //2~9
					int y = ran.nextInt(9)+1; // 1~9
					System.out.print(x + " * " + y + " = ");
					int answer = scan.nextInt();
					if(answer == x*y) {
						System.out.println("정답 입니다.");
						correct++;
					} else {
						System.out.println("오답! 정답은 " + (x*y) + "입니다.");
					}
					System.out.println(); 
				}
				System.out.println("총" + count +"문제 중 " + correct + "개 맞추었습니다.");
				System.out.println();
			}
			
		}

	}

}
