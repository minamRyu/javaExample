package testMe;

import java.util.Scanner;

public class CalcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하세요 : ");
		int x= scan.nextInt();
		System.out.print("두번째 수를 입력하세요 : ");
		int y= scan.nextInt();
		
		System.out.println(Calc.sum(x, y));
		System.out.println(Calc.multiple(x, y));
		
		double a = x;
		double b = y;
		int z = x+y;
		System.out.println(Calc.multiple(a, b));
		System.out.println(Calc.multiple(x, y, z));
	}

}
