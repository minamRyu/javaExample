package day15;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaEx extends JFrame{
	JTextField input = new JTextField(20);
	JTextArea save = new JTextArea(7, 20);
	public TextAreaEx() {
		// TODO Auto-generated constructor stub
		setTitle("텍스트 에어리어");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		save.setEditable(false);
		
		input.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JTextField name = (JTextField) e.getSource();
//				save.setText(name.getText());
				save.append(name.getText() + "\n"); // \n 줄바꿈
				name.setText("");				
			}
		});
		
		c.add(input);
		c.add(save);
		c.add(new JScrollPane(save));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 아래 3줄은 필수로 설정
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextAreaEx();

	}

}
