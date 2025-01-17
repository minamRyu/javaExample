package javaTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TestAnswer6 {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<HashMap<String, Object>> arrList = new ArrayList<>();
		while(true){
			HashMap<String, Object> hMap = new HashMap<>();
			System.out.println("=== 학생 관리 시스템 입니다! ===");
			System.out.print("(1) 학생추가 (2) 성적입력 (3) 조회 (4) 성적수정 (5) 종료 : ");
			int menuNum = scan.nextInt();
			if(menuNum == 1) {
				System.out.print("이름 입력 : ");
				String name = scan.next();
				
				boolean updateFlag = false;
				for(int i=0; i<arrList.size(); i++) {
					HashMap<String, Object> student = arrList.get(i);
					if(name.equals(student.get("name"))) {
						System.out.println("이미 존재하는 학생입니다. 처음으로 이동 합니다.");
						updateFlag = true;
						break;
					} else {
						student.put("name", name);
					}	
				}
				if(!updateFlag) {
					hMap.put("name", name);
					arrList.add(hMap);
					System.out.println("학생이 추가되었습니다!");
				}
				
			} else if(menuNum == 2) {
				System.out.print("이름 입력 : ");
				String name = scan.next();
				
				boolean updateFlag = false;
				for(int i=0; i<arrList.size(); i++) {
					HashMap<String, Object> student = arrList.get(i);
					if(name.equals(student.get("name"))) {
						updateFlag = true;
						System.out.print("java : ");
						int java = scan.nextInt();
						if(java>0 && java<=100) {
							hMap.put("java", java);
						} else {
							System.out.println("0~100 값을 입력하세요!");
						}
						
						System.out.print("oracle : ");
						int oracle = scan.nextInt();
						if(oracle>0 && oracle<=100) {
							hMap.put("oracle", oracle);
						} else {
							System.out.println("0~100 값을 입력하세요!");
						}
					}
				}
				if(!updateFlag) {
					System.out.println("없는 사용자 입니다.");
				}
				arrList.add(hMap);
				
				
			} else if(menuNum == 3) {
				for(int i=0; i<arrList.size(); i++) {
					System.out.println(arrList.get(i));
				}
				
			} else if(menuNum == 4) {
				
				
				
			} else if(menuNum == 5) {
				System.out.println("종료 되었습니다.");				
				break;
				
			} else {
				System.out.println("1~5의 숫자를 입력하세요!");
				continue;
				
			}
			
			
		}
		
		

	}

}
