package day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Map2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		// json : list + map의 형태
		// 스캐너로 이름, 나이, 키를 입력받아서
		// 3명의 정보를 리스트에 저장
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			HashMap<String, Object> map = new HashMap<>(); // 안에서 실행해야 순차적으로 입력된다
			
			System.out.print("이름 : ");
			String name = scan.next();
			
			System.out.print("나이 : ");
			int age = scan.nextInt();
			
			System.out.print("키 : ");
			double height = scan.nextInt();
			
			map.put("이름", name);
			map.put("나이", age);
			map.put("키", height);
			list.add(map);
			
		}
		System.out.println(list);
	}

}
