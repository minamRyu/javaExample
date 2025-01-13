package day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ListMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 홍길동 1000포인트, 홍길동이 없으면 새로생성, 있으면 기존값에 더하기
		Scanner scan = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		for(;;) {
			HashMap<String, Object> map = new HashMap<>();
			System.out.print("[(1) 추가 (2) 확인 (3) 삭제 (4) 종료] : ");
			int menu = scan.nextInt();
			if(menu == 1) {
				System.out.print("이름 : ");
//				map.put("name", scan.next());
				String name = scan.next();
				System.out.print("포인트 : ");
				int point = scan.nextInt();
				
				boolean checkFlag = false;
				for(int i=0; i<list.size(); i++) {
					if(name.equals(list.get(i).get("name"))) {
						int newPoint = (int) list.get(i).get("point") + point; // (int)를 사용하여 get point 값을 언박싱
						list.get(i).put("point", newPoint);
						checkFlag = true;
						break;
					}
				}
				if(!checkFlag) {
					map.put("name", name);
					map.put("point", point);
					list.add(map);
				}
				
			} else if(menu == 2) {
				// 이름을 입력 받아서 ***의 포이트는 *** 입니다
				System.out.print("이름 : ");
				String name =  scan.next();
				for(int i=0; i<list.size(); i++) {
					if(name.equals(list.get(i).get("name"))) {
						System.out.println(list.get(i).get("name") + "님의 포인트는 " + list.get(i).get("point") + "입니다.");
						break;
					}
				}
			}
		}
	}

}
