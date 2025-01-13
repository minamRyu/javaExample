package day12;

import java.util.ArrayList;
import java.util.Scanner;

public class ListReview3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<>(); 
		Scanner scan = new Scanner(System.in);
		
		// "그만" 이 입력되기 전까지 문자열을 입력받아서
		// list 저장
		// 저장 이후 글자수가 3글자 이상이면 
		// 문자열을 두글자 + *(글자개수) 만큼
		// ex) test >> te** 화면 출력
		// 2글자 이하는 출력 X
		
		while(true) {
			System.out.print("문자 입력 : ");
			String text = scan.next();
			if(!text.equals("그만")) {
				list.add(text);
			} else {
				break;
			}
		}
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).length() >= 3) {
				System.out.print(list.get(i).substring(0, 2)); // substring 많이 쓰인다 잘 기억!!
				for(int j=0; j<list.get(i).length()-2; j++) {
					System.out.print("*");
				}
			}
			System.out.print(" ");
		}
	}
}
