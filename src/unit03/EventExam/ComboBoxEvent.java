package unit03.EventExam;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ComboBoxEvent extends JFrame implements ActionListener{

	String[] coffee = {"�Ƹ޸�ī��", "īǪġ��", "ī���", "����������"};
	JComboBox<String> combo = new JComboBox<String>(coffee);
	
	JLabel lb = new JLabel();
	ImageIcon[] images = new ImageIcon[4];
	String[] imgNames = {"ame", "capu", "latte", "es"};
	
	public ComboBoxEvent() {
		
		for (int i = 0; i < 4; ++i)
			images[i] = new ImageIcon("img/" + imgNames[i] + ".jpg");
		
		this.setLayout(new BorderLayout());
		this.add(combo, BorderLayout.NORTH);
		this.add(lb, BorderLayout.CENTER);
		
		combo.addActionListener(this);
		
		setTitle("Ŀ���ֹ� �޺��ڽ�");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ComboBoxEvent();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == combo) {
			for (int i = 0; i < 4; ++i)
				if (combo.getSelectedItem() == coffee[i])
					lb.setIcon(images[i]);
		}
	}

}
