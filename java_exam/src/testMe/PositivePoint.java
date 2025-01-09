package testMe;

public class PositivePoint extends Point{
	PositivePoint(){
		super(0,0);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + getX() + "," + getY() + ")" + "의 점";
	}
	
	

}
