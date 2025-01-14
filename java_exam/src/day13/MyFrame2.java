package day13;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame2 extends JFrame{
	
	public MyFrame2() {
		setTitle("첫번째 GUI");
		
		Container c = getContentPane();
		c.setBackground(Color.gray);
		c.setLayout(new BorderLayout(10, 10));
		
		JButton btn1 = new JButton("1번 버튼");
		JButton btn2 = new JButton("2번 버튼");
		JButton btn3 = new JButton("3번 버튼");
		JButton btn4 = new JButton("4번 버튼");
		JButton btn5 = new JButton("5 버튼");
		
		c.add(btn1, BorderLayout.EAST);
		c.add(btn2, BorderLayout.WEST);
		c.add(btn3, BorderLayout.NORTH);
		c.add(btn4, BorderLayout.SOUTH);
		c.add(btn5, BorderLayout.CENTER);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 아래 3줄은 필수로 설정
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyFrame2 gui = new MyFrame2();

	}

}
