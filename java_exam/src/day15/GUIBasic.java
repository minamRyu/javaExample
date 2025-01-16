package day15;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class GUIBasic extends JFrame{
	public GUIBasic() {
		// TODO Auto-generated constructor stub
		setTitle("체크박스 컴포넌트");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 아래 3줄은 필수로 설정
		setSize(300, 300);
		setVisible(true);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GUIBasic();
	}

}
