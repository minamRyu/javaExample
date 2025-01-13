package day12;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class ListMap2 {
	static Scanner scan = new Scanner(System.in);
	
//	public static int setScore(String msg) {
//		while(true) {
//			System.out.print(msg + "점수 : ");
//			int score = scan.nextInt();
//			if(score <= 100 && score > 0) {
//				return score;
//			}
//			System.out.print("0~100 사이의 값을 입력하세요");
//		}
//		
//	}
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
			// 이름(name), 자바점수(java), 
			// 오라클(oracle) 점수, html(html) 점수를 입력 받아서 
			// 점수는 0~100 사이만 가능
			System.out.print("[(1) 추가 (2) 수정 (3) 확인 (3) 종료] : ");
			int menu = scan.nextInt();
			
			if(menu == 1) {
				System.out.print("이름 : ");
				String name = scan.next();
				map.put("name", name);
				
				// 자바(0~40), 오라클(0~35), HTML(0~25)
				map.put("java", setScore("자바", 40)); // 위의 메소드를 사용할때 string과 max 값
				map.put("orcle", setScore("오라클",35));
				map.put("html", setScore("Html", 25));
				
//				map.put("java", setScore("자바"));
//				map.put("orcle", setScore("오라클"));
//				map.put("html", setScore("Html"));
				
				list.add(map);	
				
//				while(true) {
//					System.out.print("자바 점수 : ");
//					int java = scan.nextInt();
//					if(java <= 100 && java > 0) {
//						map.put("java", java);
//						break;
//					}
//					System.out.print("0~100 사이의 값을 입력하세요");
//				}
//				while(true) {
//					System.out.print("오라클 점수 : ");
//					int orcle = scan.nextInt();
//					if(orcle <= 100 && orcle > 0) {
//						map.put("orcle", orcle);
//						break;
//					}
//					System.out.print("0~100 사이의 값을 입력하세요");
//				}
//				while(true) {
//					System.out.print("html 점수 : ");
//					int html = scan.nextInt();
//					if(html <= 100 && html > 0) {
//						map.put("html", html);
//						break;
//					}
//					System.out.print("0~100 사이의 값을 입력하세요");
//				}
//				list.add(map);	
				
			} else if(menu == 2) {
				// 이름, 과목명, 점수를 입력 받아서
				// 해당 학생의 과목 점수를 수정
				// ex.
				// 이름 : 홍길동
				// 과목 : 자바
				// 자바점수 : 30
				// 홍길동의 자바점수를 30으로 변경
				System.out.print("이름 : ");
				System.out.print("과목 : ");
				String subject = scan.next();
				for(int i=0; i<list.size(); i++) {
					if(subject.equals(list.get(i).get("name"))) {
						System.out.println(list.get(i).get("name") + "점수 : " + list.get(i).get("name"));
					}
				}
					
				
				
				
			} else if(menu == 3) {
				System.out.println(list); 
			}  else if(menu == 4) {
				break;
			}
			
		}

	}

}
