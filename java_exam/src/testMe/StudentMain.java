package testMe;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student hong = new Student(1234, "홍길동");
		Student yu = new Student(1357, "유재석", "컴퓨터학과" );
		
		hong.setInfo(20, "남");
		hong.getAge();
		System.out.println(hong.getAge());
		
		System.out.println(yu.toString());

	}

}
