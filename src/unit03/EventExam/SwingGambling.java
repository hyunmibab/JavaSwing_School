package unit03.EventExam;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.*;

public class SwingGambling extends JFrame implements KeyListener{

	JLabel lb1 = new JLabel("0", JLabel.CENTER);
	JLabel lb2 = new JLabel("0", JLabel.CENTER);
	JLabel lb3 = new JLabel("0", JLabel.CENTER);
	JLabel res = new JLabel("시작합니다.", JLabel.CENTER);
	
	public SwingGambling() {
		
		JPanel p = new JPanel();
		p.setLayout(null);
		p.add(lb1);
		p.add(lb2);
		p.add(lb3);
		
		lb1.setBounds(30, 50, 60, 30);
		lb2.setBounds(110, 50, 60, 30);
		lb3.setBounds(190, 50, 60, 30);
		
		lb1.setOpaque(true);
		lb1.setBackground(Color.pink);
		lb2.setOpaque(true);
		lb2.setBackground(Color.pink);
		lb3.setOpaque(true);
		lb3.setBackground(Color.pink);
		
		this.setLayout(new BorderLayout());
		this.add(p, BorderLayout.CENTER);
		this.add(res, BorderLayout.SOUTH);
		
		p.addKeyListener(this);
		
		setTitle("겜블링게임");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		p.requestFocus();
	}
	
	public static void main(String[] args) {
		new SwingGambling();
	}
	
	public int randNum(int num) {
		return (int)(Math.random() * num);
	}

	@Override
	public void keyTyped(KeyEvent e) {}
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			int[] nums = {randNum(5), randNum(5), randNum(5)};
			
			lb1.setText(Integer.toString(nums[0]));
			lb2.setText(Integer.toString(nums[1]));
			lb3.setText(Integer.toString(nums[2]));
			
			if (nums[0] == nums[1] && nums[1] == nums[2])
				res.setText("축하합니다!");
			else
				res.setText("아쉽군요!");
		}
	}
	public void keyReleased(KeyEvent e) {}

}
