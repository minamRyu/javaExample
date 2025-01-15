package day05;

import java.util.Arrays;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 오름차순으로 정렬
		
		int arr[] = {3, 5, 2, 4, 1};
		for(int i=(arr.length-1); i>0; i--) {
			for(int j=0; j<i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}	
		}
		System.out.println(Arrays.toString(arr));

	}

}
