package day13;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame6 extends JFrame{
	
	public MyFrame6() {
		setTitle("첫번째 GUI");
		
		Container c = getContentPane();
		c.setBackground(Color.gray);
		
		c.setLayout(new FlowLayout());
		JButton btn1 = new JButton("Action");
		btn1.addActionListener(new MyEvent());
		c.add(btn1);
		
		JButton btn2 = new JButton("Action");
		btn2.addActionListener(new MyEvent());
		c.add(btn2);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 아래 3줄은 필수로 설정
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame6 gui = new MyFrame6();
	}
}

class MyEvent implements ActionListener{ // ActionListener는 인터페이스이다. 인터페이스는 모든 추상메소드는 모두 오버라이딩해야 한다.
	
	@Override
	public void actionPerformed(ActionEvent e) { // e 는 이벤트 객체
		// TODO Auto-generated method stub
		JButton btn = (JButton) e.getSource();
		if(btn.getText().equals("Action")) {
			btn.setText("액션!");
		} else {
			btn.setText("Action");
		}
	}
	
}

