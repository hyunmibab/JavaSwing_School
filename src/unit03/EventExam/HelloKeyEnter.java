package unit03.EventExam;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class HelloKeyEnter extends JFrame implements KeyListener{

	JLabel lb = new JLabel("<Enter>키로 배경색이 바뀝니다.");
	JPanel contentPane = new JPanel();
	
	public HelloKeyEnter() {
		
		setContentPane(contentPane);
		contentPane.addKeyListener(this);
		contentPane.add(lb);
		
		setTitle("키이벤트 예제");
		setSize(300, 250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		contentPane.requestFocus();
	}
	
	public static void main(String[] args) {
		new HelloKeyEnter();
	}
	
	public int randInt() {
		return (int)(Math.random() * 1000) % 256;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			int r = randInt(), g = randInt(), b = randInt();
			contentPane.setBackground(new Color(r, g, b));
			lb.setText("r = " + r + " g = " + g + "b = " + b);
		}
		if (e.getKeyChar() == 'q')
			System.exit(EXIT_ON_CLOSE);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
