package day3;

import java.util.Random;
import java.util.Scanner;

public class RandomGuGudan2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random(); // Random 숫자 만들기
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		int correct = 0;
		System.out.println("랜덤 구구단 입니다. 0을 입력하면 종료됩니다.");
		while(true) {
			int x = ran.nextInt(8)+2; //2~9
			int y = ran.nextInt(9)+1; // 1~9
			System.out.print(x + " * " + y + " = ");
			int answer = scan.nextInt();
			if(answer == 0) {
				System.out.println(count + "문제중 " + correct + "문제 맞추었습니다.");
				// 00문제 중 00문제 맞추었습니다.
				break;
			} else if(answer == x*y) {
				System.out.println("정답 입니다.");
				correct++;
			} else {
				System.out.println("오답! 정답은 " + (x*y) + "입니다.");
			}
			count++;
			System.out.println();
		}
		
	}

}
