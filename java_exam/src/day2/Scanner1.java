package day2;

import java.util.Scanner;  // Ctrl + Shift + o : import 단축키

public class Scanner1 {  // Scanner1에 숫자 1을 붙이는 이유는 import Scanner와 이름이 같아 충돌남

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = scan.next(); // next는 문자열을 입력받을 수 있는 기능
		System.out.print("나이를 입력하세요 : ");
		int age = scan.nextInt(); // 숫자를 입력받을 수 있는 기능
		System.out.println(name + "의 나이는 " + age + "입니다.");
		
		

	}

}