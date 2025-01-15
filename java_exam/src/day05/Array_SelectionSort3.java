package day05;

import java.util.Arrays;

public class Array_SelectionSort3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3, 5, 2, 1, 4};
		
		for(int j=0; j<(arr.length-1); j++) {
			int minIndex = j;
			for(int i=j+1; i<arr.length; i++) {
				if(arr[i] < arr[minIndex]) {
					minIndex = i;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[j];
			arr[j] = temp;
			
			System.out.println(Arrays.toString(arr));
		}
		
		

	}

}
