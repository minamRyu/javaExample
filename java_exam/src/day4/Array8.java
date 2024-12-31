package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Array8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("숫자를 몇개 저장하시겠습니까? : ");
			int value = scan.nextInt();
			int arr[];
			if(value > 0 ) {
				arr = new int[value];
				for(int i=0; i<arr.length; i++) {
					System.out.print((i+1) + "번째 숫자를 넣으세요 : ");
					int num = scan.nextInt();
					if(num <= 0) {
						System.out.println("양의 정수를 넣으세요.");
						i--;
					} else {
						arr[i] = num;
					}	
				}
				System.out.println(Arrays.toString(arr));
				break;
			} else if(value <= 0){
				System.out.println("양의 정수를 넣으세요.");
			}
		}
	}

}
