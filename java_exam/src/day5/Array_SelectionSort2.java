package day5;

import java.util.Arrays;

public class Array_SelectionSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3, 5, 2, 1, 4};
		
		// 배열에서 가장 작은 수를 찾아서 인덱스 0번재 값이랑 위치변경
		int minIndex = 0;
		for(int i=1; i<arr.length; i++) {
			if(arr[i] < arr[minIndex]) {
				minIndex = i;
			}
		}
		int temp = arr[minIndex];
		arr[minIndex] = arr[0];
		arr[0] = temp;
		
		System.out.println(Arrays.toString(arr));
		// 위의 결과는 [1, 5, 2, 3, 4]
		
		minIndex = 1;
		for(int i=2; i<arr.length; i++) {
			if(arr[i] < arr[minIndex]) {
				minIndex = i;
			}
		}
		temp = arr[minIndex];
		arr[minIndex] = arr[1];
		arr[1] = temp;
		
		System.out.println(Arrays.toString(arr));
		// 위의 결과는 [1, 2, 5, 3, 4]
		
		minIndex = 2;
		for(int i=3; i<arr.length; i++) {
			if(arr[i] < arr[minIndex]) {
				minIndex = i;
			}
		}
		temp = arr[minIndex];
		arr[minIndex] = arr[2];
		arr[2] = temp;
		
		System.out.println(Arrays.toString(arr));
		// 위의 결과는 [1, 2, 3, 5, 4]	
		
		minIndex = 3;
		for(int i=4; i<arr.length; i++) {
			if(arr[i] < arr[minIndex]) {
				minIndex = i;
			}
		}
		temp = arr[minIndex];
		arr[minIndex] = arr[3];
		arr[3] = temp;
		
		System.out.println(Arrays.toString(arr));
		// 위의 결과는 [1, 2, 3, 5, 4]	

	}

}
