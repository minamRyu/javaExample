package day15;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxEx extends JFrame{
	public CheckBoxEx() {
		// TODO Auto-generated constructor stub
		setTitle("체크박스 컴포넌트");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JCheckBox check1 = new JCheckBox("사과");
		JCheckBox check2 = new JCheckBox("배", true);
		ImageIcon twitter1 = new ImageIcon("image/twitter_icon.png");
		ImageIcon twitter2 = new ImageIcon("image/social_icon.png");
		JCheckBox check3 = new JCheckBox(twitter1);
		check3.setBorderPainted(true);
		check3.setSelectedIcon(twitter2);
		
		c.add(check1);
		c.add(check2);
		c.add(check3);
		
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 아래 3줄은 필수로 설정
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBoxEx();
	}
}
