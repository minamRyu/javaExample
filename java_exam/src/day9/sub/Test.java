package day9.sub;

public class Test {
	static void increase(int n) {
		n = n+1;
	}
	
	static void increase(Circle c) {
		c.radius++;
	}
	
	public static void main(String[] args) {
		int n = 30;
		increase(n);
		System.out.println(n);
		
		Circle c1 = new Circle(50);
		increase(c1);
		System.out.println(c1.radius);
		
		Circle c2 = new Circle(20);
		c2.radius = 30;
		System.out.println(c2.radius);
		
		Circle c3 = c2;
		c3.radius = 100;
		increase(c3);
		System.out.println(c2.radius);
	}
	// 위의 결과값 n은 30
	
}

class Circle {
	int radius;
	
	Circle(int r) {
		radius = r;
	}
}
