package testReview;

import java.util.Random;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = { 500, 100, 50, 10 };
		int money = new Random().nextInt(500) + 1;// 5000~10이지만 0하나 빼고 *10함
		money *= 10;
		System.out.println("금액 : " + money);

		for (int i = 0; i < coin.length; i++) {

			int res = money / coin[i]; // 몫 구하기

			System.out.println(coin[i] + "원 : " + res);
			money %= coin[i];// 나머지로 다음 동전

		} // for

	}

}
