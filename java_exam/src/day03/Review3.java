package day03;

public class Review3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1~30 중에 3의 배수이면서 5의 배수인 숫자를 출력
		// "실행"
		for(int i = 1; i <= 30; i++) {
			if((i %3 == 0) && (i %5 == 0)) {
				System.out.println(i);
			} 			
		}

	}

}
