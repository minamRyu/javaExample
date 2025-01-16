package day15;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class ListChangeEx extends JFrame{
	private JTextField input = new JTextField(10);
	private Vector<String> v = new Vector<String>();
	private JList<String> list = new JList<String>(v);
	
	public ListChangeEx() {
		// TODO Auto-generated constructor stub
		setTitle("ListChange 컴포넌트");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		input.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JTextField obj = (JTextField) e.getSource(); // 봐둘것!!!!
				String name = obj.getText();
				v.add(name);
				list.setListData(v);
				obj.setText("");
				System.out.println(name);
			}
		});
		
		list.setVisibleRowCount(5);
		list.setFixedCellWidth(100);
		
		c.add(input);
		c.add(list);
		c.add(new JScrollPane(list));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 아래 3줄은 필수로 설정
		setSize(200, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ListChangeEx();
	}
}
