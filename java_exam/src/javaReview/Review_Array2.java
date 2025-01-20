package javaReview;

import java.util.Arrays;

public class Review_Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 5, 4, 2, 6, 3};
//		for(int i=0; i<arr.length-1; i++) {
//			int minIndex = i;
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[minIndex] > arr[j]) {
//					minIndex = j;
//				}
//			}
//			int temp = arr[minIndex];
//			arr[minIndex] = arr[i];
//			arr[i] = temp;
//		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
