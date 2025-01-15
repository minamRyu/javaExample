package day14;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class KeyCodeEx extends JFrame{
	
	public KeyCodeEx() {
		
		setTitle("마우스 이벤트");
		Container c = getContentPane();
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyChar() == '%') {
					c.setBackground(Color.black);
				} else if(e.getKeyCode() == KeyEvent.VK_F1) {
					c.setBackground(Color.blue);
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
		KeyCodeEx event = new KeyCodeEx();
	}

}
