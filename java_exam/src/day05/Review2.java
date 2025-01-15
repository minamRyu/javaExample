package day05;

public class Review2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3, 5, 10, 2, 4};
		int sum = 0;
		int max = arr[0];
		int maxIndex = 0;
		for(int i=0; i<=4; i++) {
			System.out.println(arr[i]);
			// 합계
			sum = sum + arr[i]; // sum += arr[i];
			// 최대값
			if(max < arr[i]) {
				max = arr[i];
				maxIndex = i;
			}
		}
		System.out.println("총합 : " + sum);
		System.out.println("최대값 : " + max);
		System.out.println("최대값 위치 : " + maxIndex);

	}

}
