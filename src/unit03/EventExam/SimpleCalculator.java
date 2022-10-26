package unit03.EventExam;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SimpleCalculator extends JFrame implements ActionListener{

	boolean opr = false;
	JTextField src = new JTextField(10);
	JTextField res = new JTextField(10);
	
	JButton[] btn = new JButton[16];
	String[] btnNames = {"CE", "계산", "+", "-", "*", "/"};
	
	public SimpleCalculator() {
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(0, 4, 5, 5));
		
		p1.add(new JLabel("수식"));
		p1.add(src);
		p1.add(new JLabel("결과"));
		p1.add(res);
		
		for (int i = 0; i < 16; ++i) {
			btn[i] = new JButton(i < 10 ? Integer.toString(i): btnNames[i - 10]);
			p2.add(btn[i]);
			btn[i].addActionListener(this);
		}
		
		this.setLayout(new BorderLayout());
		this.add(p1, BorderLayout.NORTH);
		this.add(p2, BorderLayout.CENTER);
		
		setTitle("간단한 계산기");
		setSize(350, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SimpleCalculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "CE") {
			src.setText("");
			res.setText("");
			opr = false;
		}
		else if (e.getActionCommand() == "계산" && opr == true) {
			for (int i = 0; i < src.getText().length(); ++i) {
				char nowC = src.getText().charAt(i);
				if (nowC == '+')
					res.setText(Integer.toString(Integer.parseInt(src.getText().substring(0, i)) + Integer.parseInt(src.getText().substring(i + 1))));
				if (nowC == '-')
					res.setText(Integer.toString(Integer.parseInt(src.getText().substring(0, i)) - Integer.parseInt(src.getText().substring(i + 1))));
				if (nowC == '*')
					res.setText(Integer.toString(Integer.parseInt(src.getText().substring(0, i)) * Integer.parseInt(src.getText().substring(i + 1))));
				if (nowC == '/')
					res.setText(Integer.toString(Integer.parseInt(src.getText().substring(0, i)) / Integer.parseInt(src.getText().substring(i + 1))));
			}
		}
		else {
			for (int i = 0; i < 10; ++i)
				if (e.getSource() == btn[i]) {
					src.setText(src.getText() + i);
					opr = true;
				}
			for (int i = 0; i < 4; ++i)
				if (e.getActionCommand() == btnNames[i + 2] && opr == true) {
					src.setText(src.getText() + btnNames[i + 2]);
					opr = false;
				}
		}
	}

}
