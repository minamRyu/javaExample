package day06;

public class Food {
	private String name; // private 지금 여기 클래스에서만 사용가능 
	private int price;   // class의 변수들은 대부분 private로 설정한다
	
	public String getName() { // 우클릭. source. generate get/set 해서 변수 체크하면 자동생성
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	Food(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	void sell() {
		System.out.println(price + "원에 판매했습니다.");
	}
	
//	void setPrice(int price) {
//		if(price<0) {
//			System.out.println("가격을 다시 확인하세요.");
//			return; // 아래줄을 실행하지 않고 메소드를 빠져나간다.
//		}
//		System.out.println("정말" + price + "가 맞나요?");
//		this.price = price;
//	}
//	int getPrice() {
//		return price;
//	}
	

}
