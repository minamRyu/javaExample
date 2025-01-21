package javaReTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex5 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static int setNumber(String msg, int min, int max) {
		while(true) {
			System.out.print(msg + ": ");
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
//		"=== (1) 과일 추가 (2) 과일 판매 (3) 가격수정 (4) 현황 파악 (그외) 종료 ==="
		while(true) {
			HashMap<String, Object> map = new HashMap<>();
			System.out.print("[(1) 과일 추가 (2) 과일 판매 (3) 가격 수정 (4) 현황 파악 (그외) 종료] : ");
			int menu = scan.nextInt();
			if(menu == 1) {
				// 과일추가
				System.out.print("과일명 : ");
				String name = scan.next();
				map.put("name", name);
				
				boolean updateFlag = false;
				for(int i=0; i<list.size(); i++) {
					HashMap<String, Object> user = list.get(i);
					if(name.equals(user.get("name"))) {
						int count = setNumber("개수", 1, 300 - (int) user.get("count"));
						user.put("count", (int) user.get("count") + count);
						updateFlag = true;
						break;
					}
				}
				if(!updateFlag) {
					int count = setNumber("개수", 1, 300);
					map.put("count", count);
					int price = setNumber("가격", 100, 100000);
					map.put("price", price);
					list.add(map);
				
			} else if(menu == 2) {
				
			} else if(menu == 3) {
				
			} else if(menu == 4) {
				
			} else {
				// 종료
				break;
			}
		}
		}
	}	
}
