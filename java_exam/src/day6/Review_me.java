package day6;

import java.util.Arrays;

public class Review_me {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 정렬 복습
		int arr[] = {3, 2, 4, 5, 1};
		
		// 내림차순 버블 정렬
		for(int i=(arr.length-1); i>0; i--) {
			for(int j=0; j<i; j++) {
				if(arr[j] < arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		// 오름차순 버블 정력
		for(int i=1; i<arr.length; i++) {
			for(int j=0; j<(arr.length-i); j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		// 내림차순 selection 정렬
		for(int i=0; i<(arr.length-1); i++) {
			int maxIndex = i;
			for(int j=(i+1); j<arr.length; j++) {
				if(arr[j] > arr[maxIndex]) {
					maxIndex = j;
				}
			}
			int temp = arr[maxIndex];
			arr[maxIndex] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
