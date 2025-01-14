package day13;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame4 extends JFrame{
	
	public MyFrame4() {
		setTitle("첫번째 GUI");
		
		Container c = getContentPane();
		c.setBackground(Color.gray);
		c.setLayout(null);
		
		JButton btn1 = new JButton("test");
		btn1.setSize(60, 60);
		btn1.setLocation(100, 150);
		c.add(btn1);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 아래 3줄은 필수로 설정
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyFrame4 gui = new MyFrame4();

	}

}
