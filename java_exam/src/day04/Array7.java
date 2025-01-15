package day04;

import java.util.Arrays;

public class Array7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//가장 큰 수의 위치 찾기
		
		// 내가 푼거
//		int arr[] = {3, 5, 2, 12, 16, 4, 1, 10};
//		int max = arr[0];
//		int j = 0;
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i] > max) {
//				max = arr[i];
//				j = i;
//			}	
//		}
//		System.out.println("가장 큰 수의 위치는 : " + (j+1) + "번째");
		
		// 예제 풀이
		int arr[] = {3, 2, 5, 4, 1};
		int maxIndex = 0;
		int minIndex = 0;
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > arr[maxIndex]) {
				maxIndex = i;
			}	
			minIndex = arr[i] < arr[minIndex] ? i : minIndex;
		}
		System.out.println(maxIndex);
		System.out.println(minIndex);
		int minBackUp = arr[minIndex];
		arr[minIndex] = arr[maxIndex];
		arr[maxIndex] = minBackUp;
		System.out.println(Arrays.toString(arr));
		
	}

}
