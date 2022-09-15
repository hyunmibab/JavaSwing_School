package unit03.LayoutExam;

import java.awt.Color;

import javax.swing.*;

public class HelloPanel extends JFrame{

	public HelloPanel() {
		
		JPanel p = new JPanel();
		p.setBackground(Color.ORANGE);
		this.add(p);
		
		JButton btn1 = new JButton("��ư1");
		JButton btn2 = new JButton("��ư2");
		btn1.setBackground(Color.YELLOW);
		btn2.setBackground(Color.PINK);
		p.add(btn1);
		p.add(btn2);
		
		setTitle("�ȳ� �г�!");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new HelloPanel();
	}

}
