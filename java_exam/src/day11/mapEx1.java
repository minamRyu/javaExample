package day11;

import java.util.ArrayList;
import java.util.HashMap;

public class mapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		HashMap<String, Object> map = new HashMap<>(); // String, String 보다 String Object를 많이 쓴다
		
		map.put("name", "홍길동");
		map.put("age", 30);
		map.put("heght", 180.5);
		list.add(map);
		
		System.out.println(list);
		System.out.println(list.get(1).get("name"));
//		System.out.println(map.get("name"));
//		list는 []로 표시, map data는 {}로 표시된다

	}

}
