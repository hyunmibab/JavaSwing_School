package unit03.EventExam;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GuessNum extends JFrame implements ActionListener{

	private JTextField tf = new JTextField(10);
	private JButton btnOk = new JButton("입력");
	private JButton btnSet = new JButton("재시작");
	private JTextArea ta = new JTextArea();
	private JScrollPane sp = new JScrollPane(ta);
	
	private int comNum;
	private int cnt = 0;
	
	public GuessNum() {
		
		JLabel lb = new JLabel("숫자 입력(0~99)");
		lb.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel(new BorderLayout());
		
		this.setLayout(new BorderLayout());
		this.add(p1, BorderLayout.NORTH);
		this.add(p2, BorderLayout.CENTER);
		
		p1.add(lb);
		p1.add(tf);
		p1.add(btnOk);
		p1.add(btnSet);
		p2.add(sp);
		
		btnOk.addActionListener(this);
		btnSet.addActionListener(this);
		
		comNum = makeRanNum();
		
		setTitle("숫자 맞추기");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GuessNum();
	}
	
	public int makeRanNum() {
		return (int)Math.random();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnOk) {
			
		}
	}
	
}
