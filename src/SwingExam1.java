
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class SwingExam1 extends JFrame implements ActionListener, ItemListener  {

	//�����ϰ��� �ϴ� �����̳ʿ� ������Ʈ ��ü �����ϱ�
	
	JCheckBox menu1 = new JCheckBox("������");
	JCheckBox menu2 = new JCheckBox("����");
	JCheckBox menu3 = new JCheckBox("�");
	JLabel lb_result = new JLabel("���� 0���Դϴ�.", JLabel.CENTER);
	JRadioButton pay1 = new JRadioButton("����");
	JRadioButton pay2 = new JRadioButton("ī��");
	JButton btn1 = new JButton("����");
	JButton btn2 = new JButton("����");
	
	int sum = 0;
	
	public SwingExam1() {
		
		setLayout(new GridLayout(0,1));
		
		JLabel lb = new JLabel("������2000��,����3000��,�500��", JLabel.CENTER);
		this.add(lb);
		
		JPanel p1 = new JPanel();
		this.add(p1);
		p1.add(menu1);
		p1.add(menu2);
		p1.add(menu3);
		
		this.add(lb_result);
		
		//�޴��� ���� �̺�Ʈ �ޱ�
		
		menu1.addItemListener(this);
		menu2.addItemListener(this);
		menu3.addItemListener(this);
		
		JPanel p2 = new JPanel();
		this.add(p2);
		
		// ������ư �׷� �����, ȭ�鿡 ���̱�

		ButtonGroup bg = new ButtonGroup();
		bg.add(pay1);
		bg.add(pay2);
		
		p2.add(pay1);
		p2.add(pay2);
		
		JPanel p3 = new JPanel();
		this.add(p3);
		
		p3.add(btn1);
		p3.add(btn2);
		
		//��ư�� ���� �̺�Ʈ �ޱ�
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		setTitle("������1");
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
				JOptionPane.showMessageDialog(null, "�������� " + sum + "�� �����մϴ�.");
			if (pay2.isSelected())
				JOptionPane.showMessageDialog(null, "ī��� " + sum + "�� �����մϴ�.");
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