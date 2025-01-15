package day06;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3, 5, -4, -10, 8, -5, 6, 2};
		
		// 양의 숫자만 가지는 배열로 재정립 
		int newArr[];
		int count = 0;
		for(int num : arr) {
			if(num > 0) {
				count++;
			}
		}
		newArr = new int[count];
		int index = 0;
//		for(int i = 0; i<arr.length; i++) {
//			if(arr[i] > 0) {
//				newArr[index++] = arr[i];
//			}
//		}
		
		// 위의 for문과 같다
		for(int num : arr) {
			if(num > 0) {
				newArr[index++] = num;
			}
		}
		System.out.println(Arrays.toString(newArr));
		
	}

}
