package day05;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3, 5, 2, 4, 1};
		
		// 배열의 인덱스에 있는 숫자만큼 별을 찍어라
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i]; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
