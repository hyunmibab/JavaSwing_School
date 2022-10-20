package unit03.EventExam;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class HelloKeyMove extends JFrame implements KeyListener{

	JLabel lb = new JLabel("Hello");
	JPanel contentPane = new JPanel();
	
	public HelloKeyMove() {

		setContentPane(contentPane);
		contentPane.addKeyListener(this);
		contentPane.setLayout(null);
		contentPane.add(lb);
		
		lb.setSize(300, 250);
		lb.setLocation(50, 50);
		
		setTitle("키이벤트 예제");
		setSize(300, 250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		contentPane.requestFocus();
	}
	
	public static void main(String[] args) {
		new HelloKeyMove();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_UP)
			lb.setLocation(lb.getX(), lb.getY() - 1);
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
			lb.setLocation(lb.getX(), lb.getY() + 1);
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
			lb.setLocation(lb.getX() + 1, lb.getY());
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
			lb.setLocation(lb.getX() - 1, lb.getY());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
