package javaTest;

public class Car {
	String kind;
	String color;
	int speed;
	
	public Car(String kind, int speed, String color) {
		this.kind = kind;
		this.color = color;
		this.speed = speed;
	}
	
	
	public void SpeedUp(int speed) {
		if((this.speed += speed) >= 200) {
			this.speed = 200;
		} else if((this.speed += speed) < 200) {
			this.speed += speed;
		} else {
			this.speed = speed;
		}
	}
	
	public void SpeedDown(int speed) {
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
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "차 종류는 " + kind + "," + "색은 " + color + " 입니다.";
	}

}
