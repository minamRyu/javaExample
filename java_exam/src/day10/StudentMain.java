package day10;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student hong = new Student(1234, "홍길동");
		Student yu = new Student(1357, "유재석", "컴퓨터학과");
		
		hong.setInfo(20, "남");
		
		int age = hong.getAge();
		System.out.println(age);
		System.out.println(hong.getAge()); // 위의 2줄 코딩과 같다
		
		System.out.println(yu.toString());
		System.out.println(yu); // toString은 삭제 가능
	}

}
