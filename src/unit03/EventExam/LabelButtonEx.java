package unit03.EventExam;

import javax.swing.*;

public class LabelButtonEx extends JFrame{
	
	public LabelButtonEx() {		
		
		JPanel p = new JPanel();
		this.add(p);
		
		p.add(new JLabel("���ӽ� �����Դϴ�~~"));
		p.add(new JLabel(new ImageIcon("img/gosling.jpg")));
		
		JButton btn = new JButton("call~", new ImageIcon("img/normalIcon.gif"));
		btn.setPressedIcon(new ImageIcon("img/pressedIcon.gif"));
		btn.setRolloverIcon(new ImageIcon("img/rolloverIcon.gif"));
		p.add(btn);
		
		setTitle("�󺧰� ��ư����");
		setSize(300, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new LabelButtonEx();
	}

}
