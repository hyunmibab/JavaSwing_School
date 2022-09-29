package unit03.EventExam;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingLogin extends JFrame implements ActionListener{

	JTextField tfId = new JTextField();
	JPasswordField tfPwd = new JPasswordField();
	JButton btnLogin = new JButton("로그인");
	JButton btnCancel = new JButton("취소");
	JLabel lbResult = new JLabel("결과 출력");
	
	public SwingLogin() {
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(0, 2));
		p.add(new JLabel("아이디", JLabel.CENTER));
		p.add(tfId);
		p.add(new JLabel("비밀번호", JLabel.CENTER));
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
		
		setTitle("로그인");
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
				lbResult.setText("아이디를 입력하세요.");
			else if (new String(tfPwd.getPassword()).equals(""))
				lbResult.setText("비밀번호를 입력하세요.");
			else
				lbResult.setText(tfId.getText() + "님의 비번은 " + new String(tfPwd.getPassword()) + "입니다.");
		}
		if (e.getSource() == btnCancel) {
			lbResult.setText("취소하였습니다");
			tfId.setText("");
			tfPwd.setText("");
		}
	}
}
