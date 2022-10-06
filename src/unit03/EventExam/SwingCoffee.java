package unit03.EventExam;

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class SwingCoffee extends JFrame implements ItemListener{

	JRadioButton ame = new JRadioButton("아메리카노");
	JRadioButton latte = new JRadioButton("라떼");
	JRadioButton capu = new JRadioButton("카푸치노");
	JTextArea ta = new JTextArea();
	JScrollPane sp = new JScrollPane(ta);
	
	public SwingCoffee() {
		
		this.setLayout(new BorderLayout());
		JPanel p = new JPanel();
		p.add(ame);
		p.add(latte);
		p.add(capu);

		ButtonGroup rg = new ButtonGroup();
		rg.add(ame);
		rg.add(latte);
		rg.add(capu);
		
		this.add(p, BorderLayout.NORTH);
		this.add(sp, BorderLayout.CENTER);
		
		ame.addItemListener(this);
		latte.addItemListener(this);
		capu.addItemListener(this);
		
		setTitle("커피주문");
		setSize(500, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingCoffee();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED)
			ta.append(((AbstractButton)e.getItem()).getText() + "가 선택되었습니다.\n");
		else if (e.getStateChange() == ItemEvent.DESELECTED)
			ta.append(((AbstractButton)e.getItem()).getText() + "가 해제되었습니다.\n");
	}

}
