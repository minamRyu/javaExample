package day13;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class MyFrame3 extends JFrame{
	
	public MyFrame3() {
		setTitle("첫번째 GUI");
		
		Container c = getContentPane();
		c.setBackground(Color.gray);
		GridLayout grid = new GridLayout(3, 3);
		
		grid.setHgap(5);
		grid.setVgap(5);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 아래 3줄은 필수로 설정
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyFrame3 gui = new MyFrame3();

	}

}