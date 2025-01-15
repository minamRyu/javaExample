package day08;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person hong = new Person("홍길동", 30, "서울");
		Student kim = new Student("김철수", 25, "인천");
//		kim.name = "김철수"; // name은 Person에 있는 요소이지만 상속받아서 접근가능
		kim.eat(); // eat은 Person에 있는 요소이지만 상속받아서 접근가능
		kim.study();
		
//		kim.equals(kim); // equals 메소드는 문자열 비교 메소드, 혹은 객체간 비교할때 사용
		
		Student park = new Student("박영희", 20, "제주도", "12341234");
	}

}
