package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		// 5개의 값을 스캐너로 받아라
		
		int arr[] = new int[5];
		for(int i=0; i<arr.length; i++) {
			System.out.print(i + "번째 값 입력 : ");
			arr[i] = scan.nextInt();		
		}
		System.out.println(Arrays.toString(arr));

	}

}
