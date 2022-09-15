package unit03.LayoutExam;

import java.awt.GridLayout;

import javax.swing.*;

public class HelloGridLayout extends JFrame {

	public HelloGridLayout() {
		
		JPanel p = new JPanel();
		this.add(p);
		
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		JButton btn4 = new JButton("버튼4");
		JButton btn5 = new JButton("버튼5");
		JButton btn6 = new JButton("버튼6");
		JButton btn7 = new JButton("버튼7");
		
		//p.setLayout(new GridLayout(0, 2));
		p.setLayout(new GridLayout(0, 3, 10, 10));
		p.add(btn1); p.add(btn2);
		p.add(btn3); p.add(btn4);
		p.add(btn5); p.add(btn6);
		p.add(btn7);
		
		setTitle("안녕 그리드레이아웃!");
		setSize(350, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new HelloGridLayout();
	}

}
