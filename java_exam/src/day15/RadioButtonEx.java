package day15;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonEx extends JFrame{
	public RadioButtonEx() {
		// TODO Auto-generated constructor stub
		setTitle("라디오 버튼");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ButtonGroup gender = new ButtonGroup();
		JRadioButton radio1 = new JRadioButton("남");
		JRadioButton radio2 = new JRadioButton("여");
		
		gender.add(radio1);
		gender.add(radio2);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 아래 3줄은 필수로 설정
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RadioButtonEx();
	}

}
