package day2;

public class Loop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <=10; i++ ) {
			System.out.println(i);
		}
		System.out.println();
		
		// test : 1~10중에 홀수만 출력
		
		for (int j = 1; j <= 10; j+=2) {
			System.out.println(j);
		}
		System.out.println();
		
		// 위의 방법은 유지보수가 어려워 아래방법을 권장		
		for (int k = 1; k <= 10; k++) {
			if (k % 2 == 1) {
				System.out.println(k);
			}
		}

	}

}
