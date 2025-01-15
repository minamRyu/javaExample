package day06;

public class HumanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human hong = new Human("홍길동", 30, "인천"); // 클래스 이름과 같은 메소드. 곧 생성자 메소드를 호출
		System.out.println(hong.name);
		
		// 김철수, 25, 제주도 생성해라
		Human kim = new Human("김철수", 25, "제주도");
		System.out.println(kim.name + kim.age + kim.addr);
		
		// 박영희, 35, 주소입력 안함
		Human park = new Human("박영희", 35);
		System.out.println(park.name + " " + park.age +  " " + park.addr);
	}

}
