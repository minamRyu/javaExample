package day9.sub;

public class ArrayRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 3, 5, 4 , 2, 10, 7};
		
//		int arr2[] = arr;
//		arr2[3] = 100;
//		System.out.println(arr[3]);
		
		int max = ArrayClass.maxValue(arr);
		System.out.println(max);
		
		int index = ArrayClass.maxIndex(arr);
		System.out.println(index);

	}

}
