package testMe;

public class PositivePoint extends Point{
	public PositivePoint(){
		super(0,0);
	}
	
//	protected void move(int x, int y) {
//		if(x<0 || y<0) {
//			move(x, y);
//		}
//	}
//	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + getX() + "," + getY() + ")" + "의 점";
	}
	
	

}
