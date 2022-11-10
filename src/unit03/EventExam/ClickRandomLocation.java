package unit03.EventExam;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class ClickRandomLocation extends JFrame implements MouseListener{

	JLabel lb = new JLabel("나잡아봐라");
	JPanel p = new JPanel();
	
	public ClickRandomLocation() {
		
		p.setLayout(null);
		p.add(lb);
		lb.setBounds(50, 50, 80, 40);
		
		this.add(p);
		
		lb.addMouseListener(this);
		
		setTitle("클릭연습");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ClickRandomLocation();
	}
	
	public int random(int num) {
		return (int)(Math.random() * num);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		lb.setLocation(random(p.getWidth() - lb.getWidth()), random(p.getHeight() - lb.getHeight()));
	}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}

}
