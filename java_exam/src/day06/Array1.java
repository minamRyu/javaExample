package day06;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3, 5, 2, 1, 4};
		int sum= 0;
		for(int num : arr) {
			sum += num;
		}
		System.out.println(Arrays.toString(arr));
//		위의 for문과 같은 기본 코드
//		for(int i=0; i<arr.length; i++) {
//			sum += arr[i];
//		}
	}

}
