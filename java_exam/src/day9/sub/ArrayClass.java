package day9.sub;

public class ArrayClass {
	
	static int maxValue(int[] array) {
		
		int max = array[0];
		for(int value : array) { // 배열의 개수만큼 실행
			if(max < value) {
				max = value;
			}
		}
		return max;
	}
	
	// 배열에서 가장 큰 값의 위치를 찾는(리턴) 메소드 작성
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
	
}
