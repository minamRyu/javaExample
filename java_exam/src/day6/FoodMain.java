package day6;

public class FoodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food beer = new Food("맥주", 3000);
		
		beer.setPrice(3500); // 메소드로 간접적으로 private에 접근, 메소드로 제어 가능.
		
		System.out.println(beer.getPrice());
	}

}
