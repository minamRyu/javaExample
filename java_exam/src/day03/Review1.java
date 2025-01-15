package day03;

import java.util.Scanner;

public class Review1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = scan.nextInt();
		
		age += 1; // age = age + 1;
		if(age >= 20) { // age가 20보다 크거나 같다면
			System.out.println("성인 입니다.");
			
		} else if (age >= 10) {
			System.out.println("10대 입니다.");
		} else {
			System.out.println("10살 미만 입니다.");
		}

	}

}
