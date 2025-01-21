package javaReTest;

public class Human {
	
	private String name;
	private int age;
	private String phone;
	
	public Human(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
	}

	public Human(String name, int age, String phone) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + "의 나이는 " + age + "입니다.";
	}
	
	boolean setPhone(String phone) {
		if(phone.length()==11) {
			return false;
		} else {
			System.out.println("핸드폰번호는 11글자로 입력해주세요.(- 제외)");
			return true; 
		}
	}	
}
