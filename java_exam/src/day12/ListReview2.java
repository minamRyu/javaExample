package day12;

import java.util.ArrayList;
import java.util.Scanner;

public class ListReview2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<>(); 
		Scanner scan = new Scanner(System.in);
		
		// -1이 입력되기 전까지 문자열을 입력받아서
		// list 저장
		// 저장 이후 글자수가 5글자 이상인 문자열을 화면에 출력
				
		while(true) {
			System.out.print("문자 입력 : ");
			String text = scan.next();
			if(!text.equals("-1")) {
				list.add(text);
			} else {
				break;
			}
		}
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).length() >=5) {
				System.out.print(list.get(i) + " ");
			}
		}
	}
}
