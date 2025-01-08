package day9;

public class IPTV extends ColorTV{
	String ip;
	
	IPTV(String ip, int size, int color) {
		super(size, color);
		this.ip = ip;
	}
	
//	결과 : 나의 IPTV는 192.1.1.2 주소의 32인치 2048컬러
	@Override
	void printProperty() { // Ctrl + space 키로 오버라이드 자동 생성
		// TODO Auto-generated method stub
		System.out.print("나의 IPTV는 " + ip + " 주소의 ");
		super.printProperty();
	}
}
