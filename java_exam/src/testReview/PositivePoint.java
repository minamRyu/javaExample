package testReview;

public class PositivePoint extends Point{
	PositivePoint() {
		super(0,0); // 아무 data를 받지 않았을때 0,0으로 초기화
	}
	
	PositivePoint(int x, int y){
		super(x, y); // super만 쓰는건 부모 생성자 호출이라 첫줄에!! if 밑에 넣을 수 없다.
		if(x < 0 || y < 0) { 
			super.move(0, 0); // 부모생성자의 move 메소드 호출
		}
	}
	
	
	@Override
	protected void move(int x, int y) {
		// TODO Auto-generated method stub
		if(!(x<0 || y<0)) { // x, y가 둘다 양수일때 move
			super.move(x, y);
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + getX() + "," + getY() + ")" + "의 점";
	}

}
