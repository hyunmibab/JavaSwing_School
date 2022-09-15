package unit03.LayoutExam;

import javax.swing.*;

public class HelloAbsLayout extends JFrame{

	public HelloAbsLayout() {
		
		setLayout(null);
		
		JButton btn1 = new JButton("¹öÆ°1");
		btn1.setSize(70, 40);
		btn1.setLocation(10, 30);
		
		JButton btn2 = new JButton("¹öÆ°2");
		btn2.setBounds(150, 30, 90, 20);
		
		add(btn1);
		add(btn2);
		
		setTitle("¾È³ç ¾Û¼Ö·çÆ®·¹ÀÌ¾Æ¿ô!");
		setSize(350, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new HelloAbsLayout();
	}

}
