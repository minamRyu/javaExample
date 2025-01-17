package javaTest;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car("소나타", 0, "검정");
		System.out.println(c);
		
		c.SpeedUp(100);
		System.out.println(c.getSpeed()); // 100
		
		c.SpeedUp(150);
		System.out.println(c.getSpeed()); // 200
		
		c.SpeedDown(30);
		System.out.println(c.getSpeed()); // 170


	}

}
