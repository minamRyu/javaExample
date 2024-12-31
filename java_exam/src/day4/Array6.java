package day4;

import java.util.Arrays;
import java.util.Random;

public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 랜던함 숫자 6개를 배열에 넣으시오.
		Random ran = new Random(); // Random 숫자 만들기
//		int arr[] = new int[6];
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = ran.nextInt(45)+1; // 1 ~ 45
//		}
//		System.out.println(Arrays.toString(arr));
		
		// 랜던한 숫자 6개를 배열, 단 중복 제외
		int arr[] = new int[6];
		for(int i=0; i<arr.length; i++) {
			arr[i] = ran.nextInt(45)+1; // 1 ~ 45	
			int j = 0;
			while(j<i) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				} else {
					j++;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}
}
