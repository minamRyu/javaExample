package day06;

import java.util.Arrays;
import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 2차원 배열
//		아래와 같으 스캐너로 값을 입력 받으시오
//		{10, 20}
//		{30, 40}
//		{5, 3}
//		{10, 20}
		
		int arr[][] = new int[4][2];
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(i + "," + j + "번째 수 입력 : ");
				arr[i][j] = scan.nextInt();
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}

}
