package unit03.LayoutExam;

import java.awt.*;

import javax.swing.*;

public class LayoutTest2 extends JFrame{

	public LayoutTest2() {
		
		this.setLayout(new BorderLayout());
		
		JButton btn1 = new JButton("��ư1");
		JButton btn2 = new JButton("��ư2");
		JButton btn3 = new JButton("��ư3");
		JButton btn4 = new JButton("��ư4");
		JButton btn5 = new JButton("��ư5");
		JButton btn6 = new JButton("��ư6");
		
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		p1.add(btn1);
		p1.add(btn2);
		
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(0, 2));
		p2.add(btn3);
		p2.add(btn4);
		
		JPanel p3 = new JPanel();
		p3.setLayout(new FlowLayout());
		p3.add(btn5);
		p3.add(btn6);
		
		this.add(p1, BorderLayout.NORTH);
		this.add(p2, BorderLayout.CENTER);
		this.add(p3, BorderLayout.SOUTH);
		
		setTitle("���̾ƿ� ����");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new LayoutTest2();
	}

}
