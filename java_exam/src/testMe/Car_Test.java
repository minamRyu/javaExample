package testMe;

public class Car_Test {
	String name;
	String color;
	int speed;
	
	public Car_Test() {
		this.name = "기본차";
		this.color = "하얀색";
	}
	public Car_Test(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	
	
	public void setInfo(String name, String color, int speed) {
		this.name = name;
		this.color = color;
	}
	
	public void carInfo() {
		System.out.println("자동차의 이름은 " + name + "," + " 색상은 " + color + "입니다.");
	}
	
	public void speedUp(int speed) {
		if(speed >= 200) {
			System.out.println("200 이상의 속도는 불가합니다. 200으로 변경됩니다.");
		}
		this.speed = speed;
	}
	
	public void speedDown(int speed) {
		if(speed > 0) {
			this.speed -= speed;
		} else {
			System.out.println("0 미만의 속도는 불가합니다. 0으로 변경됩니다.");
			this.speed = speed;
		}
	}
	
	public int getSpeed() {
		return speed;
	}

}
