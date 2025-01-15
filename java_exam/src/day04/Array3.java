package day04;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		// 배열의 합 구하기
		int arr[] = {3, 5, 2, 7};
//		int sum = 0;
//		for(int i=0; i<arr.length; i++) {
//			sum += arr[i];
//		}
//		System.out.println("합계는 : " + sum);
		
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			
		}
		System.out.println(max);

	}

}
