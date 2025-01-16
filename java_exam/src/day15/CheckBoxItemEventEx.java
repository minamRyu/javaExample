package day15;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxItemEventEx extends JFrame{
	private JLabel result = new JLabel();
	private int sum = 0;

	public CheckBoxItemEventEx() {
		
		// TODO Auto-generated constructor stub
		setTitle("체크박스 컴포넌트");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel label = new JLabel("사과 100원 바나나 500원 복숭아 700원");
		c.add(label);
		JLabel result = new JLabel("현재 0원 입니다.");
		
		String names [] = {"사과", "바나나", "복숭아"};
		for(int i=0; i<names.length; i++) {
			JCheckBox fruit = new JCheckBox(names[i]);
			fruit.setBorderPainted(true);
			fruit.addItemListener(new ItemListener() {
				@Override
				public void itemStateChanged(ItemEvent e) {
					// TODO Auto-generated method stub
					JCheckBox fruit = (JCheckBox) e.getItem();
					if(e.getStateChange() == ItemEvent.SELECTED) {
						if(fruit.getText().equals("사과")) {
							sum += 100;
						} else if(fruit.getText().equals("바나나")) {
							sum += 500;
						} else {
							sum += 700;
						} 
						System.out.println(fruit.getText() + "선택되었음!");
					} else {
						if(fruit.getText().equals("사과")) {
							sum -= 100;
						} else if(fruit.getText().equals("바나나")) {
							sum -= 500;
						} else {
							sum -= 700;
						}
						System.out.println(fruit.getText() + "해제 되었음!");
					}
					result.setText("현재" + sum + "원 입니다.");
				}
			});
			c.add(fruit);
		}
		c.add(result);
		
		
//		JCheckBox check1 = new JCheckBox("사과");
//		check1.setBorderPainted(true);
//		c.add(check1);
		
//		JCheckBox check2 = new JCheckBox("바나나");
//		check2.setBorderPainted(true);
//		c.add(check2);
		
//		JCheckBox check3 = new JCheckBox("복숭아");
//		check3.setBorderPainted(true);
//		c.add(check3);
		
//		JLabel result = new JLabel("현재 0원 입니다.");
//		c.add(result);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 아래 3줄은 필수로 설정
		setSize(270, 300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBoxItemEventEx();
	}

}
