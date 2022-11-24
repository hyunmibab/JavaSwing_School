package unit03.Exam;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class SwingExam2 extends JFrame implements KeyListener, MouseListener{

	String[] data = {"설계과", "제어과", "시스템과", "정보통신과"};
	JComboBox<String> combo = new JComboBox<String>(data);

	JPanel p = new JPanel();
	JTextField tf = new JTextField(10);
	JLabel lb_result = new JLabel("<Enter>키를 누르면 소속과 이름을 보여줍니다.");
	
	public SwingExam2() {
		
		p.add(new JLabel("학과 : "));
		p.add(combo);
		p.add(new JLabel("이름 : "));
		p.add(tf);
		p.add(lb_result);
		
		this.add(p);
		
		tf.addKeyListener(this);
		p.addMouseListener(this);
		
		setTitle("수행평가2");
		setSize(400, 150);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingExam2();
	}

	public int random(int n) {
		return (int)(Math.random() * n);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {}
	public void keyReleased(KeyEvent e) {}
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER)
			if (tf.getText().trim().length() > 0)
				lb_result.setText("당신은 " + data[(int)combo.getSelectedIndex()] + " " + tf.getText().trim() + "입니다.");
	}

	@Override
	public void mouseClicked(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {
		p.setBackground(new Color(random(256), random(256), random(256)));
	}
	public void mouseExited(MouseEvent e) {
		p.setBackground(new Color(random(256), random(256), random(256)));
		
	}
	
}
