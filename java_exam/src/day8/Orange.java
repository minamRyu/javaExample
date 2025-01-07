package day8;

public class Orange extends Fruit{
	
	@Override
	void print() {
		// TODO Auto-generated method stub
		System.out.println("오렌지는 달다."); // 오버라이딩
//		super.print();
	}
	
	@Override
	public String toString() { // toString은 오브젝트 클래스의 메소드
		// TODO Auto-generated method stub
		return "과일명 : " + name + ", 색 : " + color + ", 가격 : " + price + "원 입니다.";
	}

}
