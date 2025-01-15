package day14;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlyingTextEx extends JFrame{
	public FlyingTextEx() {
		setTitle("텍스트 이동");
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel label = new JLabel("Hello");
		label.setSize(50, 30);
		label.setLocation(50, 50);
		c.add(label);
		
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				int key = e.getKeyCode(); // KeyCode 값은 int 형 이다
				if(key == KeyEvent.VK_RIGHT) {
					label.setLocation(label.getX() + 10, label.getY());
				} else if(key == KeyEvent.VK_LEFT) {
					label.setLocation(label.getX() - 10, label.getY());
				} else if(key == KeyEvent.VK_UP) {
					label.setLocation(label.getX(), label.getY() - 10);
				} else if(key == KeyEvent.VK_DOWN) {
					label.setLocation(label.getX(), label.getY() + 10);
				}
			}
		});
		
		c.setFocusable(true);
		c.requestFocus();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 아래 3줄은 필수로 설정
		setSize(500, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlyingTextEx();
	}
}
