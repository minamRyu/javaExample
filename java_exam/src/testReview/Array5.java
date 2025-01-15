package testReview;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// arr의 모든 요소에 값을 1~20사이의 랜덤한 값으로 넣기
		// 그다음에 모든 수의 평균 구하기
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int arr[][] = new int[3][4];
		// 내가 푼거
//		int sum = 0;
//		int total = 0;
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				arr[i][j] = ran.nextInt(20)+1;
//				sum += arr[i][j];
//			}
//			System.out.println(Arrays.toString(arr[i]));
//		}
//		total = (arr.length)*(arr[0].length);
//		System.out.println("평균값 : " + sum/total);
		
		// 예제 풀이
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = ran.nextInt(20)+1; // nextInt(20)+1 은 1~20까지의 수
			}
			System.out.println(Arrays.toString(arr[i]));
		}	
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		System.out.println(sum/(arr.length*arr[0].length));
	}
}
