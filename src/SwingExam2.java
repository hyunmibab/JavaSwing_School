import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class SwingExam2 extends JFrame implements KeyListener, MouseListener {


	//구현하고자 하는 컨테이너와 컴포넌트 객체 선언하기
	String[] data = {"설계과", "제어과", "시스템과", "정보통신과"};
	JComboBox<String> combo = new JComboBox<String>(data);
	
	JTextField tf = new JTextField(10);
	JLabel lb_result = new JLabel("<Enter>키를 누르면 소속과 이름을 보여줍니다.");
	JPanel p = new JPanel();
	
	public SwingExam2() {
		
		add(p);
		
		JLabel lb1 = new JLabel("학과 : ");
		JLabel lb2 = new JLabel("이름 : ");
		
		p.add(lb1);
		p.add(combo);
		p.add(lb2);
		p.add(tf);
		p.add(lb_result);
		
		//이벤트 달기
		
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
			lb_result.setText("당신은 " + data[combo.getSelectedIndex()] + " " + tf.getText() + "입니다.");
	}

}
