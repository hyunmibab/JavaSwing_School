package unit03.EventExam;

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class SwingCoffee extends JFrame implements ItemListener{

	JRadioButton ame = new JRadioButton("�Ƹ޸�ī��");
	JRadioButton latte = new JRadioButton("��");
	JRadioButton capu = new JRadioButton("īǪġ��");
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
		
		setTitle("Ŀ���ֹ�");
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
			ta.append(((AbstractButton)e.getItem()).getText() + "�� ���õǾ����ϴ�.\n");
		else if (e.getStateChange() == ItemEvent.DESELECTED)
			ta.append(((AbstractButton)e.getItem()).getText() + "�� �����Ǿ����ϴ�.\n");
	}

}
