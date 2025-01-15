package day03;

import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class RandomGuGudan1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random ran = new Random(); // Random 숫자 만들기
		Scanner scan = new Scanner(System.in);
				
//		for(int i=1; i<=30; i++) {
//			int x = ran.nextInt(10); // 0~9
//			int x = ran.nextInt(10)+2; // 1~10
//			int x = ran.nextInt(8)+2; // 2~9
//			System.out.println(x);
//		}
		
		int x = ran.nextInt(8)+2; // 2~9
		int y = ran.nextInt(9)+1; // 1~9
		
		System.out.print(x + " * " + y + " = ");
		int result = scan.nextInt();
		if(result == (x*y)) {
			System.out.println("정답입니다.");
		} else {
			System.out.println("오답 입니다." + " 정답은 " + (x*y) + "입니다.");
		}
					
	}

}
