package day13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ListMap2 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static int setNumber(String msg, int min, int max) {
		while(true) {
			System.out.println(msg + ": ");
			int number = scan.nextInt();
			if(number > min && number <= max) {
				return number;
			}
			System.out.println(min + "~" + max + " 값을 입력하세요.");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		// 과일가게 system 제작
		// 1번 메뉴 - 과일추가
		// 2번 메뉴 - 과일판매
		// 3번 메뉴 - 과일확인
		// 4번 메뉴 - 종료
		
		while(true) {
			HashMap<String, Object> map = new HashMap<>();
			System.out.print("[(1) 과일추가 (2) 과일판매 (3) 과일확인 (4) 종료] : ");
			int menu = scan.nextInt();
			if(menu == 1) {
				// 추가
				// 과일명(name), 가격(price), 개수(num)을 입력
				System.out.print("과일명 : ");
				String name = scan.next();
				map.put("name", name);
				
				// 가격조건 : 100~1000000
//				while(true) {
//					System.out.print("가격 : ");
//					int price = scan.nextInt();
//					if(price > 100 && price <= 100000) {
//						map.put("price", price);
//						break;
//					} 
//					System.out.println("가격은 100원~100000원 사이입니다.");
//				}
				int price = setNumber("가격", 100, 100000);
				map.put("price", price);
				
				
				// 개수조건 : 1~300
//				while(true) {
//					System.out.print("개수 : ");
//					int num = scan.nextInt();
//					if(num > 1 && num < 300) {
//						map.put("num", num);
//						break;
//					} 
//					System.out.println("개수는 1개~300개 사이입니다.");
//				}
				int num = setNumber("개수", 1, 300);
				map.put("num", num);
				
				list.add(map);
				
			} else if(menu == 2) {
				// 판매
//				for(int i=0; i<list.size(); i++) {
//					HashMap<String, Object> fruit = list.get(i);
//					System.out.println("판매과일");
//					String sellFruit = scan.next();
//					if(sellFruit.equals(fruit.get("name"))) {
//					}
//				}
//				
				
			} else if(menu == 3) {
				// 확인
				System.out.println(list);
				
			} else if(menu == 4) {
				// 종료
				break;
			} else {
				// 다시시도
				
			}
			
			
		}
		

	}

}
