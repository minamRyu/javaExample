package day9;

public class Point3D extends Point{
	private int z;
	Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	void moveUp() {
		z++;
	}
	
	void moveDown() { // 부모에서 move가(두개의 변수를 받아서 처리)존재하니 따로 코딩할 필요 없음
		z--;
	}
	
	void move(int x, int y, int z) {
		super.move(x, y);
		this.z = z;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + getX() + "," + getY() +  "," + z + ")" + "의 점";
		// toString은 문자열을 리턴한다. 
	}

}
