package day13;

import java.util.ArrayList;
import java.util.HashMap;

public class ListMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// json 형태 [{},{},{}] list 안에 map이 존재
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		HashMap<String, Object> user1 = new HashMap<>();
		HashMap<String, Object> user2 = new HashMap<>();
		
		user1.put("name", "홍길동"); //HashMap에 data를 넣을때는 put
		user1.put("age", 30);
		list.add(user1); // ArrayList에 data를 넣을때는 add
		
		user2.put("name", "김철수"); 
		user2.put("age", 20);
		list.add(user2); 
		
		System.out.println(list);
		
//		list.get(0); => 의 뜻은 [{name=홍길동, age=30}] 이다
//		list.get(1); => 의 뜻은 [{name=김철수, age=20}] 이다
//		for(int i=0; i<list.size(); i++) {
//			if("김철수".equals(list.get(i).get("name"))) {
//				list.get(i).put("addr", "인천");
//			}
//		}
		for(int i=0; i<list.size(); i++) {
			HashMap<String, Object> user = list.get(i); // list의 i번째 data를 user map로 저장 
			if("김철수".equals(user.get("name"))) {
				user.put("addr", "인천");
			}
		}
		System.out.println(list);
	}

}
