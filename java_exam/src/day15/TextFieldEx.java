package day15;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TextFieldEx extends JFrame{
	public TextFieldEx() {
		// TODO Auto-generated constructor stub
		setTitle("텍스트 필드");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel idLabel = new JLabel("아이디 : ");
		JTextField id = new JTextField(20);
		c.add(idLabel);
		c.add(id);
		
		JLabel pwdLabel = new JLabel("비밀번호 : ");
		JPasswordField pwd = new JPasswordField(18);
		c.add(pwdLabel);
		c.add(pwd);
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 아래 3줄은 필수로 설정
		setSize(300, 300);
		setVisible(true);
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextFieldEx();
	}

}
