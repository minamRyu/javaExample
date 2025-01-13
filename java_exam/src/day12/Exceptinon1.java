package day12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptinon1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.print("나뉘는 수 : ");
				int num1 = scan.nextInt(); // 나뉨수 입력
				System.out.print("나눌 수 : ");
				int num2 = scan.nextInt(); // 나눗수 입력
				System.out.println(num1 / num2);
				break;
			} catch (ArithmeticException e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
				System.out.println("0으로 나눌 수 없습니다.");
			} catch (InputMismatchException e) {
				System.out.println("숫자를 넣으세요");
				scan.nextLine(); // buffer를 비우는 용도
			} catch (Exception e) {
				System.out.println("예기치 못한 에러 발생");
			} 
		}
	}	

}
