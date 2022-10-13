package unit03.EventExam;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GuessNum extends JFrame implements ActionListener{

	private JTextField tf = new JTextField(10);
	private JButton btnOk = new JButton("�Է�");
	private JButton btnSet = new JButton("�����");
	private JTextArea ta = new JTextArea();
	private JScrollPane sp = new JScrollPane(ta);
	
	private int comNum;
	private int cnt = 0;
	
	public GuessNum() {
		
		JLabel lb = new JLabel("���� �Է�(0~99)");
		lb.setFont(new Font("���� ���", Font.BOLD, 15));
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
		
		setTitle("���� ���߱�");
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
				JOptionPane.showMessageDialog(this, "���� �Է��ϼ���");
				return;
			}
			if (Integer.parseInt(tf.getText()) < 0 && Integer.parseInt(tf.getText()) > 99) {
				JOptionPane.showMessageDialog(this, "�Է� ������ Ȯ�� : ���� 0~99");
				return;
			}

			if (Integer.parseInt(tf.getText()) > comNum)
				ta.append(tf.getText() + ": �ʹ� Ů�ϴ�. -" + (cnt + 1) + "ȸ\n");
			else if (Integer.parseInt(tf.getText()) < comNum)
				ta.append(tf.getText() + ": �ʹ� �۽��ϴ�. -" + (cnt + 1) + "ȸ\n");
			else if (Integer.parseInt(tf.getText()) == comNum)
				JOptionPane.showMessageDialog(this, "�����մϴ�!!");
			cnt++;
			
			if (cnt >= 5)
				JOptionPane.showMessageDialog(this, "5���� ��ȸ�� ��� ����ϼ̽��ϴ�!!! ����:" + comNum);
		}
		if (e.getSource() == btnSet) {
			comNum = makeRanNum();
			cnt = 0;
			tf.setText("");
			ta.setText("");
		}
	}
	
}
