package day9.sub;

public class ArrayClass {
	
//	static int maxValue(int[] array) {
//		
//		int max = array[0];
//		for(int value : array) { // 배열의 개수만큼 실행
//			if(max < value) {
//				max = value;
//			}
//		}
//		return max;
//	}
//	
//	// 배열에서 가장 큰 값의 위치를 찾는(리턴) 메소드 작성
//	static int maxIndex(int[] array) {
//		
//		int index = 0;
//		for(int i=1; i<array.length; i++) {
//			if(array[index] < array[i]) {
//				index = i;
//			}
//		}
//		return index;
//	}
	
	// 배열에서 가장 큰 값을 찾는 메소드
		static int maxValue(int[] array) {
			int max = array[0];
			for(int value : array) {
				if(max < value) {
					max = value;
				}
			}
			return max;
		}
		
		// 배열에서 가장 큰 값의 위치를 찾는(리턴) 메소드
		static int maxIndex(int[] array) {
			int index = 0;
			for(int i=1; i<array.length; i++) {
				if(array[index] < array[i]) {
					index = i;
				}
			}
			return index;
		}
		
		// 가장 큰 값의 위치를 찾아서 첫번째 값하고 변경
		static void changeArr(int[] array) {
			int index = 0;
			for(int i=1; i<array.length; i++) {
				if(array[index] < array[i]) {
					index = i;
				}
			}
			int temp = array[index];
			array[index] = array[0];
			array[0] = temp;
			
		}
		
		// 1. 정수형 배열에서 가장 작은 값을 찾아서 리턴해주는 메소드
		static int minValue(int[] arr) {
//			int minIdex = array[0];
//			for(int value : array) {
//				if(minIdex > value) {
//					minIdex = value;
//				}
//			}
//			return array[minIdex];
			int min = arr[0];
			for(int value : arr) {
				min = value < min ? value : min;
			}
			return min;
		}
		
		
		
		
		// 2. 배열에서 가장 큰 값과 작은 값의 위치를 바꿔주는 메소드
		static void changeMinMax(int[] arr) {
			int min = 0;
			int max = 0;
			for(int i=1; i<arr.length; i++) {
//				if(array[min] > array[i]) {
//					min = i;
//				}
				max = arr[i] < arr[max] ? i : max;
				min = arr[i] > arr[min] ? i : min;
				
			}
//			for(int j=1; j<array.length; j++) {
//				if(array[max] < array[j]) {
//					max = j;
//				}
//			}
			int temp = arr[max];
			arr[max] = arr[min];
			arr[min] = temp;
		}
}
