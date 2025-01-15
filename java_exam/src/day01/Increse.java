package day01;

public class Increse {

	public static void main(String[] args) {
//		int a = 1;
//		a = a + 1;
//		a++;
//		a--; // a = a - 1; 과 같다
//		System.out.println(a);
		
//		int x = 1;
//		int y = ++x;
//		System.out.println(y);
//		System.out.println(x);
		
//		int x = 10;
//		++x; // x =11
//		int y = x++; // x = 12, y = 11
//		int z = --y; // y= 10, z = 10
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);
		
		int x = 5;
		int y = ++x;
		y = x--;
		int z = x + y;
		++x;
		x = z++;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
			
		
	}

}
