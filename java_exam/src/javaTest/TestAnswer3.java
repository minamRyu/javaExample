package javaTest;

import java.util.Arrays;
import java.util.Scanner;

public class TestAnswer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int arr[] = new int[6];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("숫자를 넣으세요 : ");
			int num = scan.nextInt();
			if((num>=100) || ((num%5) == 0)) {
				System.out.println("숫자를 다시 입력하세요");
				i--;
			} else if ((num<=100) || ((num%5) != 0)) {
				arr[i] = num;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
