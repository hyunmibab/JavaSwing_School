package unit03.Exam;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class SwingExam2 extends JFrame implements KeyListener, MouseListener{

	String[] data = {"�����", "�����", "�ý��۰�", "������Ű�"};
	JComboBox<String> combo = new JComboBox<String>(data);

	JPanel p = new JPanel();
	JTextField tf = new JTextField(10);
	JLabel lb_result = new JLabel("<Enter>Ű�� ������ �ҼӰ� �̸��� �����ݴϴ�.");
	
	public SwingExam2() {
		
		p.add(new JLabel("�а� : "));
		p.add(combo);
		p.add(new JLabel("�̸� : "));
		p.add(tf);
		p.add(lb_result);
		
		this.add(p);
		
		tf.addKeyListener(this);
		p.addMouseListener(this);
		
		setTitle("������2");
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
				lb_result.setText("����� " + data[(int)combo.getSelectedIndex()] + " " + tf.getText().trim() + "�Դϴ�.");
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
