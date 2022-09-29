package unit03.EventExam;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingLogin extends JFrame implements ActionListener{

	JTextField tfId = new JTextField();
	JPasswordField tfPwd = new JPasswordField();
	JButton btnLogin = new JButton("�α���");
	JButton btnCancel = new JButton("���");
	JLabel lbResult = new JLabel("��� ���");
	
	public SwingLogin() {
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(0, 2));
		p.add(new JLabel("���̵�", JLabel.CENTER));
		p.add(tfId);
		p.add(new JLabel("��й�ȣ", JLabel.CENTER));
		p.add(tfPwd);
		p.add(btnLogin);
		p.add(btnCancel);
		
		btnLogin.setBackground(Color.YELLOW);
		btnCancel.setBackground(Color.PINK);
		
		this.setLayout(new BorderLayout());
		this.add(new JLabel(new ImageIcon("img/robot.PNG")), BorderLayout.NORTH);
		this.add(p, BorderLayout.CENTER);
		this.add(lbResult, BorderLayout.SOUTH);
		
		btnLogin.addActionListener(this);
		btnCancel.addActionListener(this);
		
		setTitle("�α���");
		setSize(300, 250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingLogin();
	}

	@Override
	public void actionPerformed(ActionEvent e) {	
		if (e.getSource() == btnLogin) {
			if (tfId.getText().equals(""))
				lbResult.setText("���̵� �Է��ϼ���.");
			else if (new String(tfPwd.getPassword()).equals(""))
				lbResult.setText("��й�ȣ�� �Է��ϼ���.");
			else
				lbResult.setText(tfId.getText() + "���� ����� " + new String(tfPwd.getPassword()) + "�Դϴ�.");
		}
		if (e.getSource() == btnCancel) {
			lbResult.setText("����Ͽ����ϴ�");
			tfId.setText("");
			tfPwd.setText("");
		}
	}
}
