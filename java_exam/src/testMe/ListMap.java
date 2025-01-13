package testMe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ListMap {
	static Scanner scan = new Scanner(System.in);
	
	public static int setScore(String msg, int max) {
		while(true) {
			System.out.println(msg + "점수 : ");
			int score = scan.nextInt();
			if(score <= max && score > 0) {
				return score;
			}
			System.out.println("0~" + max + " 사이의 값을 입력하세요");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		while(true) {
			System.out.print("[(1) 추가 (2) 수정 (3) 확인 (4) 종료] : ");
			int menu = scan.nextInt();
			
			if(menu == 1) {
				HashMap<String, Object> map = new HashMap<>();
				System.out.print("이름 :  ");
				String name = scan.next();
				map.put("name", name);
				
				// 자바(0~40), 오라클(0~35), HTML(0~25)
				map.put("java", setScore("자바", 40));
				map.put("orcle", setScore("오라클", 35));
				map.put("html", setScore("HTML", 25));
				
				list.add(map);
				
			} else if(menu == 2) {
				
			} else if(menu == 3) {
				System.out.println(list);
			} else if(menu == 4) {
				break;
			}
			
		}
		

	}

}
