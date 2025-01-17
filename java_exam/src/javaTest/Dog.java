package javaTest;

public class Dog extends Animal{
	private String sound;
	
	public Dog(String name, int age) {
		super(name, age);
	}
	
	public void info() {
		System.out.println("이름은" + name + " 나이는 " + age + "");
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("멍멍!");
	}


}
