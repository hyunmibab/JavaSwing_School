package unit03.EventExam;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ComButton extends JFrame implements ActionListener{

	JPanel p = new JPanel();
	JButton btnY = new JButton("�����");
	JButton btnP = new JButton("��ũ��");
	
	public ComButton() {
		
		p.add(btnP);
		p.add(btnY);
		
		this.add(p);
		
		btnY.addActionListener(this);
		btnP.addActionListener(this);
		
		setTitle("���� �ٲٱ�");
		setSize(700, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ComButton();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnY) {
			p.setBackground(Color.YELLOW);
		}
		if (e.getSource() == btnP) {
			p.setBackground(Color.PINK);
		}
	}
}
