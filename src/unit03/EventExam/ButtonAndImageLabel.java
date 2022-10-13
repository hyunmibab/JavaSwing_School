package unit03.EventExam;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ButtonAndImageLabel extends JFrame implements ActionListener{

	int nowImage = 0;
	JLabel la = new JLabel();
	ImageIcon[] image = new ImageIcon[4];
	JButton btnleft = new JButton(new ImageIcon("img/left.png"));
	JButton btnright = new JButton(new ImageIcon("img/right.png"));
	
	public ButtonAndImageLabel() {
		
		for (int i = 0; i < image.length; ++i)
			image[i] = new ImageIcon("img/image" + i + ".jpg");
		la.setIcon(image[0]);
		
		JPanel p = new JPanel();
		p.add(btnleft);
		p.add(btnright);
		
		this.setLayout(new BorderLayout());
		this.add(la, BorderLayout.CENTER);
		this.add(p, BorderLayout.SOUTH);
		
		btnleft.addActionListener(this);
		btnright.addActionListener(this);
		
		setTitle("ÀÌ¹ÌÁöºä¾î");
		setSize(300, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ButtonAndImageLabel();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnright) {
			nowImage++;
			if (nowImage > 3) nowImage = 0;
			la.setIcon(image[nowImage]);
		}
		if (e.getSource() == btnleft) {
			nowImage--;
			if (nowImage < 0) nowImage = 3;
			la.setIcon(image[nowImage]);
		}
	}

}
