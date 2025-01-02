package day5;

import java.util.Arrays;

public class Array_SelectionSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// selection sort
		int arr[] = {3, 5, 2, 1, 4};
		for(int i=0; i<(arr.length-1); i++) {
			int minIndex = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
