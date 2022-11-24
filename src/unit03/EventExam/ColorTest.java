package unit03.EventExam;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ColorTest extends JFrame implements ActionListener{

	public static int start = 0;
	
	static JPanel p = new JPanel();
	JButton btn1 = new JButton("시작");
	JButton btn3 = new JButton("종료");
	
	public ColorTest() {
		
		p.add(btn1);
		p.add(btn3);
		
		this.add(p);
		
		btn1.addActionListener(this);
		btn3.addActionListener(this);
		
		setTitle("색상 테스트");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ColorTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1)
			for (int r = 0; r < 256; ++r)
				for (int g = 0; g < 256; ++g)
					for (int b = 0; b < 256; ++b)
						p.setBackground(new Color(r, g, b));
		if (e.getSource() == btn3) System.exit(0);
		
	}

}
