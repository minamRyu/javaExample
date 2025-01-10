package day10;

public class Dog extends Animal{
	private String breed;
	
	public Dog() {
		super("정보없음", 0);
	}
	
	public Dog(String name, int age, String breed) {
		super(name, age);
		this.breed = breed;
	}
	
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("멍멍!");
	}
	
	public String getBreed() {
		return breed;  
	}
}
