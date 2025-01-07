package day8;

class Point {
	private int x; // 한 점을 구성하는 x, y 좌표
	private int y;
		
	public void set(int x, int y) {
		this.x = x; 
		this.y = y;
	}
		
	public void showPoint() { // 점의 좌표 출력
		System.out.println("(" + x + "," + y + ")");
	}
}

