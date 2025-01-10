package day11;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		
		for(int i=0; i<4; i++) {
			System.out.print("이름을 입력하세요 >> ");
			String name = scan.next();
			list.add(name);
		}
//		System.out.println(list);
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + "\t"); 
		}

//		가장 긴 이름 출력
		String longName = "";
		for(int j=0; j<list.size(); j++) {
			if(longName.length() < list.get(j).length()) {
				longName = list.get(j);
			}
		}
		System.out.println("\n가장 긴 이름 : " + longName);
		
//		가장 긴 이름이 동일 값이 있을 경우
//		동일한 길이의 이름 모두 출력
		
	}

}
