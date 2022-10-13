package unit03.EventExam;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class CheckBoxItemEventEx extends JFrame implements ItemListener{

	int sumFruit = 0;
	JLabel lb = new JLabel("현재 " + sumFruit + "원입니다.");

	JCheckBox[] fruit = new JCheckBox[3];
	String[] names = {"사과", "배", "체리"};
	int[] price = {100, 500, 2000};
	
	public CheckBoxItemEventEx() {
		
		JPanel p = new JPanel();
		this.add(p);
		
		p.add(new JLabel("사과 100원, 배 500원, 체리 2000원"));
		for (int i = 0; i < fruit.length; ++i) {
			fruit[i] = new JCheckBox(names[i]);
			p.add(fruit[i]);
			fruit[i].addItemListener(this);
		}
		p.add(lb);
		
		setTitle("체크박스 과일가격계산");
		setSize(250, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new CheckBoxItemEventEx();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			for (int i = 0; i < fruit.length; ++i)
				if (e.getItem() == fruit[i]) sumFruit += price[i];
		}
		else if (e.getStateChange() == ItemEvent.DESELECTED) {
			for (int i = 0; i < fruit.length; ++i)
				if (e.getItem() == fruit[i]) sumFruit -= price[i];
		}
		
		lb.setText("현재 " + sumFruit + "원입니다.");
	}

}
