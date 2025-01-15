package day04;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 5개의 공간을 가지는 arr 배열 선언
//		int arr[] = new int[5]; // int[] arr = new int[5]; 와 같다.
//		arr[0] = 10; // default 값은 0 이다.
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
//		내부 보관은 arr[] = {10,20,30,40,50} 으로 보관된다.
//		System.out.println(Arrays.toString(arr)); // arr 전체 출력 메소드
		
		int arr[] = {10,20,30,40,50};
//		System.out.println(arr[4]);
//		System.out.println(arr.length);
		for(int i=0; i<arr.length; i++) { // arr.length : 배열의 길이값
			System.out.println(arr[i]);
		}

	}

}
