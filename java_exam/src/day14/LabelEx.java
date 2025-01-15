package day14;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelEx extends JFrame{
	public LabelEx() {
		setTitle("레이블 실습");
		Container c = getContentPane();
		c.setBackground(Color.LIGHT_GRAY);
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("자바 재밌다.");
		c.add(label);
		
		ImageIcon image1 = new ImageIcon("image/cat.jpg");
		Image image = image1.getImage();
        Image scaledImage = image.getScaledInstance(600, 400, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        
//		ImageIcon image1 = new ImageIcon("image/cat.jpg");
		JLabel label2 = new JLabel(scaledIcon);
		c.add(label2);
		
		ImageIcon twitter = new ImageIcon("image/twitter_icon.png");
		JLabel label3 = new JLabel("자바 좋아!", twitter, SwingConstants.CENTER);
		c.add(label3);
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 아래 3줄은 필수로 설정
		setSize(800, 700);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LabelEx();
	}

}