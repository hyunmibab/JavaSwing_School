import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class SwingExam2 extends JFrame implements KeyListener, MouseListener {


	//�����ϰ��� �ϴ� �����̳ʿ� ������Ʈ ��ü �����ϱ�
	String[] data = {"�����", "�����", "�ý��۰�", "������Ű�"};
	JComboBox<String> combo = new JComboBox<String>(data);
	
	JTextField tf = new JTextField(10);
	JLabel lb_result = new JLabel("<Enter>Ű�� ������ �ҼӰ� �̸��� �����ݴϴ�.");
	JPanel p = new JPanel();
	
	public SwingExam2() {
		
		add(p);
		
		JLabel lb1 = new JLabel("�а� : ");
		JLabel lb2 = new JLabel("�̸� : ");
		
		p.add(lb1);
		p.add(combo);
		p.add(lb2);
		p.add(tf);
		p.add(lb_result);
		
		//�̺�Ʈ �ޱ�
		
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

	@Override
	public void mouseClicked(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {
		p.setBackground(new Color((int)(Math.random() * 256), (int)(Math.random() * 256), (int)(Math.random() * 256)));
	}
	public void mouseExited(MouseEvent e) {
		p.setBackground(new Color((int)(Math.random() * 256), (int)(Math.random() * 256), (int)(Math.random() * 256)));
	}

	@Override
	public void keyTyped(KeyEvent e) {}
	public void keyReleased(KeyEvent e) {}
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER && tf.getText().trim().length() > 0)
			lb_result.setText("����� " + data[combo.getSelectedIndex()] + " " + tf.getText() + "�Դϴ�.");
	}

}
