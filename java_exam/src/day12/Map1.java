package day12;

import java.util.HashMap;

public class Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> map = new HashMap<>();
		
		map.put("name", "홍길동");
		map.put("age", "30");
		
		String ageStr = map.get("age");
		int age = Integer.parseInt(ageStr) + 1; // Integer.parseInt() 자주 쓰이는 메소드. 문자를 정수로 바꾼다
		System.out.println(age);

	}

}