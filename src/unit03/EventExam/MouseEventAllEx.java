package unit03.EventExam;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

public class MouseEventAllEx extends JFrame implements MouseListener, MouseMotionListener{

	JPanel p = new JPanel();
	JLabel lb = new JLabel("��������");
	
	public MouseEventAllEx() {
		
		this.add(p);
		
		p.add(lb);
		p.setLayout(null);
		lb.setBounds(100, 50, 80, 20);
		
		p.addMouseListener(this);
		p.addMouseMotionListener(this);
		
		setTitle("���콺 �̺�Ʈ");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MouseEventAllEx();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		lb.setLocation(e.getX(), e.getY());
		setTitle("���콺�� �巡�� �ǰ� �ִ� ��ġ (" + e.getX() + ", " + e.getY() + ")");
	}
	public void mouseMoved(MouseEvent e) {
		lb.setLocation(e.getX(), e.getY());
		setTitle("���콺�� �����̰� �ִ� ��ġ (" + e.getX() + ", " + e.getY() + ")");
	}
	public void mouseClicked(MouseEvent e) {
		if (e.getClickCount() == 2) {
			lb.setLocation(e.getX(), e.getY());
			setTitle("���콺�� ����Ŭ�� �� ��ġ (" + e.getX() + ", " + e.getY() + ")");
		}
		else {
			lb.setLocation(e.getX(), e.getY());
			setTitle("���콺�� Ŭ�� �� ��ġ (" + e.getX() + ", " + e.getY() + ")");
		}
	}
	public void mousePressed(MouseEvent e) {
		lb.setLocation(e.getX(), e.getY());
		setTitle("���콺�� ������ ��ġ (" + e.getX() + ", " + e.getY() + ")");
	}
	public void mouseReleased(MouseEvent e) {
		lb.setLocation(e.getX(), e.getY());
		setTitle("���콺�� ������ ��ġ (" + e.getX() + ", " + e.getY() + ")");
	}
	public void mouseEntered(MouseEvent e) {
		p.setBackground(Color.CYAN);
	}
	public void mouseExited(MouseEvent e) {
		p.setBackground(Color.PINK);
	}

}
