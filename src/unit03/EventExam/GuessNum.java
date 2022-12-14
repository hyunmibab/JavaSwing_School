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
		return (int)(Math.random() * 100);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnOk) {
			if (tf.getText().equals("")) {
				JOptionPane.showMessageDialog(this, "값을 입력하세요");
				return;
			}
			if (Integer.parseInt(tf.getText()) < 0 && Integer.parseInt(tf.getText()) > 99) {
				JOptionPane.showMessageDialog(this, "입력 데이터 확인 : 숫자 0~99");
				return;
			}

			if (Integer.parseInt(tf.getText()) > comNum)
				ta.append(tf.getText() + ": 너무 큽니다. -" + (cnt + 1) + "회\n");
			else if (Integer.parseInt(tf.getText()) < comNum)
				ta.append(tf.getText() + ": 너무 작습니다. -" + (cnt + 1) + "회\n");
			else if (Integer.parseInt(tf.getText()) == comNum)
				JOptionPane.showMessageDialog(this, "축하합니다!!");
			cnt++;
			
			if (cnt >= 5)
				JOptionPane.showMessageDialog(this, "5번의 기회를 모두 사용하셨습니다!!! 정답:" + comNum);
		}
		if (e.getSource() == btnSet) {
			comNum = makeRanNum();
			cnt = 0;
			tf.setText("");
			ta.setText("");
		}
	}
	
}
