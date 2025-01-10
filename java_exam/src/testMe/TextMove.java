package testMe;

import java.util.Scanner;

public class TextMove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열을 입력하세요 : ");
		String a= scan.next();
		
		for(int i=0; i<a.length(); i++ ) {
			String b;
			String c;
			char d = a.charAt(0); 
			b = a.substring(1, a.length());
			c = b + d;
			
			System.out.println(c);
		}
		
		

	}

}
