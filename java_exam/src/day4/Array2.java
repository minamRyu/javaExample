package day4;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[7]; // 초기값은 {0,0,0,0,0} 이 들어가 있다
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		System.out.println(Arrays.toString(arr));

	}

}
