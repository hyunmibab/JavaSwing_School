package unit03.EventExam;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.*;

public class SimpleCalculator2 extends JFrame implements ActionListener{

	String idx = new String("");
	ArrayList<String> list = new ArrayList<>();
	
	JTextField src = new JTextField(10);
	JTextField res = new JTextField(10);
	
	JButton[] btn = new JButton[16];
	String[] btnNames = {"CE", "결과", "+", "-", "*", "/"};
	
	public SimpleCalculator2() {
		
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
		
		setTitle("간단한 계산기2");
		setSize(350, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SimpleCalculator2();
	}
	
	public int listInt(int idx) {
		return Integer.parseInt(list.get(idx));
	}
	
	public void cal(String s, int idx) {
		int result = 0;
		if (s == "*")
			result = listInt(idx - 1) * listInt(idx + 1);
		if (s == "/")
			result = listInt(idx - 1) / listInt(idx + 1);
		if (s == "+")
			result = listInt(idx - 1) + listInt(idx + 1);
		if (s == "-")
			result = listInt(idx - 1) + listInt(idx + 1);
		
		list.set(idx - 1, Integer.toString(result));
		if (list.size() > idx + 3)
			for (int i = idx; i + 2 < list.size(); i += 2) {
				list.set(i, list.get(i + 2));
				list.set(i + 1, list.get(i + 3));
			}
		list.remove(list.size() - 1); list.remove(list.size() - 1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "CE") {
			src.setText("");
			res.setText("");
			list.clear();
			idx = "";
		}
		else if (e.getActionCommand() == "결과" && !idx.isBlank()) {
			list.add(idx);
			idx = "";
			src.setText(String.join("", list));
			
			while(true) {
				if (list.indexOf("*") != -1)
					cal("*", list.indexOf("*"));
				else if (list.indexOf("/") != -1)
					cal("/", list.indexOf("/"));
				else if (list.indexOf("+") != -1)
					cal("+", list.indexOf("+"));
				else if (list.indexOf("-") != -1)
					cal("-", list.indexOf("-"));
				else
					break;
			}
			res.setText(list.get(0));
		}
		else
			for (int i = 0; i < 16; ++i)
				if (e.getActionCommand() == btn[i].getText()) {
					if (i < 10) {
						if (idx.matches("0")) {
							idx = "";
							src.setText(String.join("", list));
						}
						idx += btn[i].getText();
						src.setText(src.getText() + btn[i].getText());
					}
					else if (!idx.isBlank()) {
						list.add(idx);
						list.add(btn[i].getText());
						idx = "";
						src.setText(String.join("", list));
					}
				}
	}

}
