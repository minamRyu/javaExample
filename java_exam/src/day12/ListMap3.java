package day12;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class ListMap3 {
	static Scanner scan = new Scanner(System.in);

	public static int setScore(String msg, int max) {  // 개별 max 값을 새로 받는다
		while(true) {
			System.out.print(msg + "점수 : ");
			int score = scan.nextInt();
			if(score <= max && score > 0) {
				return score;
			}
			System.out.print("0~" + max + " 사이의 값을 입력하세요");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		while(true) {
			HashMap<String, Object> map = new HashMap<>();
			
			System.out.print("[(1) 추가 (2) 수정 (3) 확인 (3) 종료] : ");
			int menu = scan.nextInt();
			
			if(menu == 1) {
				System.out.print("이름 : ");
				String name = scan.next();
				map.put("name", name);
				
				map.put("java", setScore("자바", 40)); // 위의 메소드를 사용할때 string과 max 값
				map.put("orcle", setScore("오라클",35));
				map.put("html", setScore("Html", 25));
				
				list.add(map);	
				
			} else if(menu == 2) {
				// 이름, 과목명, 점수를 입력 받아서
				// 해당 학생의 과목 점수를 수정
				// ex.
				// 이름 : 홍길동
				// 과목 : 자바
				// 자바점수 : 30
				// 홍길동의 자바점수를 30으로 변경
				System.out.print("이름 : ");
				String name = scan.next();
				for(int i=0; i<list.size(); i++) {
					HashMap<String, Object> user = list.get(i);
					if(name.equals(user.get("name"))) {
						System.out.println("과목 : ");
						String subject = scan.next();
						user.put("java", setScore(subject, 40));
					}
					
				}
				
			} else if(menu == 3) {
				System.out.println(list); 
				
			} else if (menu == 4) {
				break;
			}
		}
	}
}
