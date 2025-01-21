package javaReTest;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6개의 공간을 가지는 int형 배열을 생성하고 스캐너를 통해 아래 조건에 맞게
//		숫자를 입력받아서 배열의 모든 공간에 넣으시오.
//		조건1. 배열에 들어가는 숫자는 1부터 100사이의 숫자일 것
//		조건2. 중복된 숫자는 들어가지 못하게 할 것
//		조건3. 배열을 새롭게 선언하고 중복된 값이 없는 형태로 내림차순 한다. (배열의 크기 하드코딩 x)
//		ex) [1,3,4,1,2] => [4,3,2,1] (1은 중복되므로 하나의 값만 입력)
		Scanner scan = new Scanner(System.in);
		
		int arr1[] = new int[6];
		int arr2[] = new int[6];
		for(int i=0; i<arr1.length; i++) {
			System.out.print("숫자를 넣으세요 : ");
			int num = scan.nextInt();
			boolean numCheck = false;
			if(num>0 && num<=100){
				for(int j=0; j<i; j++) {
					if(arr1[j] != num) {
						
					}
				}
				arr1[i] = num;
			} else {
				System.out.println("100 이하의 숫자를 넣으세요!");
				i--;
			}
		}
		System.out.println(Arrays.toString(arr1));
		
		for(int i=0; i<arr1.length; i++) {
			int maxIndex = i;
			for(int j=i+1; j<arr1.length; j++) {
				if(arr1[j] > arr1[maxIndex]) {
					maxIndex = j;
				}
			}
			int temp = arr1[maxIndex];
			arr1[maxIndex] = arr1[i];
			arr1[i] = temp;
			arr2[i] = temp;
		}
		System.out.println(Arrays.toString(arr2));
	}
}
