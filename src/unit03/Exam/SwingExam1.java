package unit03.Exam;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class SwingExam1 extends JFrame implements ItemListener, ActionListener{

	int price = 0;
	
	JLabel lb_result = new JLabel("현재" + price + "원입니다.", JLabel.CENTER);
	JCheckBox menu1 = new JCheckBox("떡볶이");
	JCheckBox menu2 = new JCheckBox("순대");
	JCheckBox menu3 = new JCheckBox("어묵");
	JRadioButton pay1 = new JRadioButton("현금");
	JRadioButton pay2 = new JRadioButton("카드");
	JButton btn1 = new JButton("결제");
	JButton btn2 = new JButton("종료");
	
	public SwingExam1() {

		ButtonGroup bg = new ButtonGroup();
		bg.add(pay1);
		bg.add(pay2);
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		
		p1.add(menu1);
		p1.add(menu2);
		p1.add(menu3);
		p2.add(pay1);
		p2.add(pay2);
		p3.add(btn1);
		p3.add(btn2);
		
		this.setLayout(new GridLayout(0, 1));
		this.add(new JLabel("떡볶이2000원,순대3000원,어묵500원", JLabel.CENTER));
		this.add(p1);
		this.add(lb_result);
		this.add(p2);
		this.add(p3);
		
		menu1.addItemListener(this);
		menu2.addItemListener(this);
		menu3.addItemListener(this);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		setTitle("수행평가1");
		setSize(250, 250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingExam1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1)
			if (pay1.isSelected() || pay2.isSelected())
				JOptionPane.showMessageDialog(null, (pay1.isSelected() ? "현금으로 ": "카드로 ") + price + "원 결제합니다.");
		if (e.getSource() == btn2)
			System.exit(0);
	}
	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			if (e.getItem() == menu1) price += 2000;
			if (e.getItem() == menu2) price += 3000;
			if (e.getItem() == menu3) price += 500;
			
			lb_result.setText("현재 " + price + "원 입니다.");
		}
		if (e.getStateChange() == ItemEvent.DESELECTED) {
			if (e.getItem() == menu1) price -= 2000;
			if (e.getItem() == menu2) price -= 3000;
			if (e.getItem() == menu3) price -= 500;

			lb_result.setText("현재 " + price + "원 입니다.");
		}
	}

}
