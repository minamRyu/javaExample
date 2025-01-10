package day11;

import java.util.Scanner;

public class TextMove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String str= scan.next();
		
		for(int i=0; i<str.length(); i++ ) {
			String first = str.substring(0, 1);
			String last = str.substring(1);
			str = last + first;
			System.out.println(str);
		}
	}
}
