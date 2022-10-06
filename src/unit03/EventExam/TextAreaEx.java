package unit03.EventExam;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TextAreaEx extends JFrame implements ActionListener{

	JTextField tf = new JTextField(20);
	JTextArea ta = new JTextArea(7, 20);
	JScrollPane sp = new JScrollPane(ta);
	
	public TextAreaEx() {
		
		JPanel p = new JPanel();
		this.add(p);
		
		p.add(new JLabel("입력후 <Enter>키를 입력하세요"));
		p.add(tf);
		p.add(sp);
		
		tf.addActionListener(this);
		
		setTitle("텍스트영역만들기");
		setSize(300, 250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TextAreaEx();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == tf) {
			ta.append(tf.getText() + "\n");
			tf.setText("");
		}
	}

}
