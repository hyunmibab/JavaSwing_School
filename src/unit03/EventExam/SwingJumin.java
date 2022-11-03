package unit03.EventExam;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class SwingJumin extends JFrame implements KeyListener, ActionListener{

	JTextField tf1 = new JTextField(10);
	JTextField tf2 = new JTextField(10);
	JButton btn = new JButton("버튼");
	
	public SwingJumin() {
		
		JPanel p = new JPanel();
		p.add(tf1);
		p.add(new JLabel("-"));
		p.add(tf2);
		p.add(btn);
		
		tf1.addKeyListener(this);
		tf2.addKeyListener(this);
		btn.addActionListener(this);
		
		this.add(p);
		
		setTitle("주민번호 분석");
		setSize(400, 100);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingJumin();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn)
			JOptionPane.showMessageDialog(null, "당신의 생일은 " + (Integer.parseInt(tf2.getText().substring(0, 1)) > 2 ? "20": "19") + tf1.getText().substring(0, 2) + "년" + tf1.getText().substring(2, 4) + "월" + tf1.getText().substring(4) + "일입니다");
	}
	
	public void keyTyped(KeyEvent e) {}
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER && e.getSource() == tf2)
			btn.doClick();
	}
	public void keyReleased(KeyEvent e) {
		if (tf1.getText().length() >= 6)
			tf2.requestFocus();
	}


}
