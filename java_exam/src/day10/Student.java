package day10;

public class Student {
	private int stuNo;
	private String stuName;
	private String stuDept;
	private int age;
	private String gender;
	
	public Student(int stuNo, String stuName){
//		this.stuNo = stuNo;
//		this.stuName = stuName;
		this(stuNo, stuName, ""); // 아래의 this를 불러온다, 위의 코딩과 같다
	}
	public Student(int stuNo, String stuName, String stuDept){
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.stuDept = stuDept;
	}
	protected void setInfo(int age, String gender) {
		this.age = age;
		this.gender = gender;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return stuName + " 학생의 학번은 " + stuNo + ", 나이는" + age + "입니다."; 
	}

}
