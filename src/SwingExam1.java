
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class SwingExam1 extends JFrame implements ActionListener, ItemListener  {

	//구현하고자 하는 컨테이너와 컴포넌트 객체 선언하기
	
	JCheckBox menu1 = new JCheckBox("떡볶이");
	JCheckBox menu2 = new JCheckBox("순대");
	JCheckBox menu3 = new JCheckBox("어묵");
	JLabel lb_result = new JLabel("현재 0원입니다.", JLabel.CENTER);
	JRadioButton pay1 = new JRadioButton("현금");
	JRadioButton pay2 = new JRadioButton("카드");
	JButton btn1 = new JButton("결제");
	JButton btn2 = new JButton("종료");
	
	int sum = 0;
	
	public SwingExam1() {
		
		setLayout(new GridLayout(0,1));
		
		JLabel lb = new JLabel("떡볶이2000원,순대3000원,어묵500원", JLabel.CENTER);
		this.add(lb);
		
		JPanel p1 = new JPanel();
		this.add(p1);
		p1.add(menu1);
		p1.add(menu2);
		p1.add(menu3);
		
		this.add(lb_result);
		
		//메뉴에 대한 이벤트 달기
		
		menu1.addItemListener(this);
		menu2.addItemListener(this);
		menu3.addItemListener(this);
		
		JPanel p2 = new JPanel();
		this.add(p2);
		
		// 라디오버튼 그룹 만들고, 화면에 붙이기

		ButtonGroup bg = new ButtonGroup();
		bg.add(pay1);
		bg.add(pay2);
		
		p2.add(pay1);
		p2.add(pay2);
		
		JPanel p3 = new JPanel();
		this.add(p3);
		
		p3.add(btn1);
		p3.add(btn2);
		
		//버튼에 대한 이벤트 달기
		
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
		if (e.getSource() == btn1) {
			if (pay1.isSelected())
				JOptionPane.showMessageDialog(null, "현금으로 " + sum + "원 결제합니다.");
			if (pay2.isSelected())
				JOptionPane.showMessageDialog(null, "카드로 " + sum + "원 결제합니다.");
		}
		if (e.getSource() == btn2)
			System.exit(0);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			if (e.getItem() == menu1) sum += 2000;
			if (e.getItem() == menu2) sum += 3000;
			if (e.getItem() == menu3) sum += 500;
		}
		if (e.getStateChange() == ItemEvent.DESELECTED) {
			if (e.getItem() == menu1) sum -= 2000;
			if (e.getItem() == menu2) sum -= 3000;
			if (e.getItem() == menu3) sum -= 500;
		}
	}

}