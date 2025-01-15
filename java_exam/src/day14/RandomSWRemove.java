package day14;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class RandomSWRemove extends JFrame{
	
	double startTime = 0;
	double endTime = 0;
	int checkNum = 1;
	
	public RandomSWRemove() {
		setTitle("랜덤 버튼 배치");
		
		Container c = getContentPane();
		c.setBackground(Color.gray);
		c.setLayout(null);
		Random ran = new Random();
		
		for(int i=1; i<=10; i++) {
			JButton btn = new JButton(i + "");
			btn.setSize(50, 50);
			int x = ran.nextInt(500);
			int y = ran.nextInt(500);
			btn.setLocation(x, y);
			
			btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JButton btn = (JButton) e.getSource();
					int btnNum = Integer.parseInt(btn.getText());
					if(btnNum == checkNum) {
						btn.setVisible(false);
						checkNum++;
						if(checkNum == 2) {
							startTime = System.currentTimeMillis();
						}
						if(checkNum > 10) {
							endTime = System.currentTimeMillis();
							double time = (endTime - startTime) / 1000;
							System.out.println(time);
						}
					}
				}
			});
			c.add(btn);
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 아래 3줄은 필수로 설정
		setSize(600,600);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomSWRemove gui = new RandomSWRemove();
	}
}


