package testMe;

public class Point3D extends Point{
	
	private int z;
	
	Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	void moveUp() {
		z = 4;
	}
	
	void moveDown() {
		z = 3;
	}
	
	protected void move(int x, int y, int z) {
		move(x, y);
		this.z = z;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + getX() + "," + getY() +  "," + z + ")" + "의 점";
	}
	

}
