package unit03.EventExam;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class CheckBoxItemEventEx extends JFrame implements ItemListener{

	int sumFruit = 0;
	JCheckBox fruit1 = new JCheckBox("���");
	JCheckBox fruit2 = new JCheckBox("��");
	JCheckBox fruit3 = new JCheckBox("ü��");
	JLabel lb = new JLabel("���� " + sumFruit + "���Դϴ�.");
	
	public CheckBoxItemEventEx() {
		
		JPanel p = new JPanel();
		this.add(p);
		
		p.add(new JLabel("��� 100��, �� 500��, ü�� 2000��"));
		p.add(fruit1);
		p.add(fruit2);
		p.add(fruit3);
		p.add(lb);
		
		fruit1.addItemListener(this);
		fruit2.addItemListener(this);
		fruit3.addItemListener(this);
		
		setTitle("üũ�ڽ� ���ϰ��ݰ��");
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
			if (e.getItem() == fruit1) sumFruit += 100;
			if (e.getItem() == fruit2) sumFruit += 500;
			if (e.getItem() == fruit3) sumFruit += 2000;
		}
		else if (e.getStateChange() == ItemEvent.DESELECTED) {
			if (e.getItem() == fruit1) sumFruit -= 100;
			if (e.getItem() == fruit2) sumFruit -= 500;
			if (e.getItem() == fruit3) sumFruit -= 2000;
		}
		
		lb.setText("���� " + sumFruit + "���Դϴ�.");
	}

}
