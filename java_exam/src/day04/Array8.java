package day04;

import java.util.Arrays;
import java.util.Scanner;

public class Array8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		// 원하는 개수만큼 수를 입력하고 그 값을 출력하시오
		
		// 내가 푼거
//		while(true) {
//			System.out.print("숫자를 몇개 저장하시겠습니까? : ");
//			int value = scan.nextInt();
//			int arr[];
//			if(value > 0 ) {
//				arr = new int[value];
//				for(int i=0; i<arr.length; i++) {
//					System.out.print((i+1) + "번째 숫자를 넣으세요 : ");
//					int num = scan.nextInt();
//					if(num <= 0) {
//						System.out.println("양의 정수를 넣으세요.");
//						i--;
//					} else {
//						arr[i] = num;
//					}	
//				}
//				System.out.println(Arrays.toString(arr));
//				break;
//			} else if(value <= 0){
//				System.out.println("양의 정수를 넣으세요.");
//			}
//		}
		
		// 예제풀이
		System.out.print("몇개의 숫자 저장? ");
		int size ;
		
		while(true) {
			size = scan.nextInt();
			if(size < 1) {
				System.out.print("1이상의 숫자를 입력해주세요. ");
			} else {
				break;
			}
		}
		int arr[] = new int[size];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1) + "번째 숫자 입력 : ");
			int input = scan.nextInt();
			if(input > 0) {
				arr[i] = input;
			} else {
				System.out.println("양수를 입력해주세요.");
				i--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
