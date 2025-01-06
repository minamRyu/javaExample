package day7;

public class HumanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human hong = new Human("홍길동", 30, "인천");
//		hong.name = "홍길동"; private 을 붙이면 이렇게 집적적 접근은 불가
//		hong.age = 30;
//		hong.intro();
		hong.setAge(hong.getAge()+1);
		hong.money = 40000;
		System.out.println("홍길동 가진 돈 : " + hong.money);
		
		hong.money_708 = 195000;
		
		Human kim = new Human("김철수", 20, "제주도");
		int age = kim.getAge();
		kim.money = 80000;
		System.out.println("철수 가진 돈 : " + kim.money);
//		System.out.println(age);
		kim.intro();

	}

}
