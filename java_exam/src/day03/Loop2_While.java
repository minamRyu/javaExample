package day03;

public class Loop2_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int i=1;
//		while(i<=10) {
//			System.out.println(i);
//			i++;
//		}
		
		// while문으로 구구단 출력
		int i=2;
		while(i<=9) {
			int j=1; // while 문에서 변수 선언 위치 확인 필요!!!
			while(j<=9) {
				System.out.println(i + " * " + j + " = " + i*j);
				j++;
			}
			i++;
		}
		
	}

}