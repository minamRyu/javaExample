package day14;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUIReview extends JFrame{
	
	public GUIReview() {
		setTitle("랜덤 버튼 배치");
		Container c = getContentPane();
		
		c.setBackground(Color.gray);
		c.setLayout(null);
		Random ran = new Random();
		
		for(int i=1; i<=10; i++) {
			JButton btn = new JButton(i + "");
			btn.setSize(50, 50);
			int x = ran.nextInt(700);
			int y = ran.nextInt(700);
			btn.setLocation(x, y);
			c.add(btn);
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 아래 3줄은 필수로 설정
		setSize(800, 800);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GUIReview gui = new GUIReview();
	}
}


