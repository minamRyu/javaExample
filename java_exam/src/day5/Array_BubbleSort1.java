package day5;

import java.util.Arrays;

public class Array_BubbleSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3, 5, 2, 4, 1, 6};
		
		// 내림차순으로 정렬
		// 내가 푼거
//		for(int i=(arr.length-1); i>0; i--) {
//			for(int j=0; j<i; j++) {
//				if(arr[j] < arr[j+1]) {
//					int temp = arr[j+1];
//					arr [j+1] = arr [j];
//					arr [j] = temp;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		
		// 예제 풀이
		for(int i=1; i<arr.length; i++) {
			for(int j=0; j<arr.length-i; j++) {
				if(arr[j] < arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
