package unit03.LayoutExam;

import java.awt.Color;

import javax.swing.*;

public class HelloButton extends JFrame{

	HelloButton(){
		
		JPanel p = new JPanel();
		p.setBackground(Color.BLACK);
		this.add(p);
		
		JButton btn = new JButton("��ư1");
		p.add(btn);
		
		setTitle("�ȳ�, ��ư!");
		setSize(300, 100);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new HelloButton();
	}

}
