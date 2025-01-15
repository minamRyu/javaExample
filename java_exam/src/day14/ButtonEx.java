package day14;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonEx extends JFrame{
	public ButtonEx() {
		setTitle("이미지 버튼 예제");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon image1 = new ImageIcon("image/twitter_icon.png");
		ImageIcon image2 = new ImageIcon("image/social_icon.png");
		ImageIcon image3 = new ImageIcon("image/brand_icon.png");
		
		JButton btn = new JButton(image1);
		btn.setRolloverIcon(image2);
		btn.setPressedIcon(image3);
		c.add(btn);
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 아래 3줄은 필수로 설정
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ButtonEx();
	}

}
