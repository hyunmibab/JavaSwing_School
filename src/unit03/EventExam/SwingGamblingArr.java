package unit03.EventExam;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class SwingGamblingArr extends JFrame implements KeyListener{

	JLabel[] lb = new JLabel[3];
	JLabel result = new JLabel("시작합니다.", JLabel.CENTER);
	
	public SwingGamblingArr() {
		
		JPanel p = new JPanel();
		p.setLayout(null);
		
		for (int i = 0; i < 3; ++i) {
			lb[i] = new JLabel("0", JLabel.CENTER);
			lb[i].setBounds(30 + 80 * i, 50, 60, 30);
			lb[i].setOpaque(true);
			lb[i].setBackground(Color.PINK);
			p.add(lb[i]);
		}
		
		this.setLayout(new BorderLayout());
		this.add(p, BorderLayout.CENTER);
		this.add(result, BorderLayout.SOUTH);
		
		p.addKeyListener(this);
		
		setTitle("겜블링게임어레이");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		p.requestFocus();
	}
	
	public static void main(String[] args) {
		new SwingGamblingArr();
	}
	
	public int rand(int num) {
		return (int)(Math.random() * num);
	}

	@Override
	public void keyTyped(KeyEvent e) {}
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			int[] num = {rand(5), rand(5), rand(5)};
			for (int i = 0; i < 3; ++i)
				lb[i].setText(Integer.toString(num[i]));
			if (num[0] == num[1] && num[1] == num[2])
				result.setText("축하합니다!");
			else
				result.setText("아쉽군요!");
		}
	}
	public void keyReleased(KeyEvent e) {}

}
