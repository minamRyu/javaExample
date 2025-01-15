package day05;

import java.util.Arrays;
import java.util.Random;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random ran = new Random(); // Random 숫자 만들기
		 // 랜던한 숫자 6개를 배열, 단 중복 제외
		 // 내가 푼거
//		int arr[] = new int[6];
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = ran.nextInt(45)+1; // 1 ~ 45	
//			int j = 0;
//			while(j<i) {
//				if(arr[i] == arr[j]) {
//					i--;
//					System.out.println("중복된 숫자 있음");
//					break;
//				} else {
//					j++;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));	
		
		// 예제 풀이
		int arr[] = new int[6];
		for(int i=0; i<arr.length; i++) {
			int ranNum = ran.nextInt(45)+1; // 1~45
			for(int j=0; j<i; j++) {
				if(ranNum == arr[j]) {
					System.out.println("중복된 숫자 있음");
					break;
				}
			}
			arr[i] = ranNum;	
			
		}
		System.out.println(Arrays.toString(arr));

	}

}
