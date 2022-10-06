package unit03.EventExam;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingCounter extends JFrame implements ActionListener{

	JTextField tf = new JTextField("0", 5);
	JButton btnInc = new JButton("증가");
	JButton btnDec = new JButton("감소");
	JButton btnCls = new JButton("초기화");
	
	public SwingCounter() {
		
		JPanel p = new JPanel();
		this.add(p);
		
		p.add(new JLabel("카운터값"));
		p.add(tf);
		p.add(btnInc);
		p.add(btnDec);
		p.add(btnCls);
	
		btnInc.addActionListener(this);
		btnDec.addActionListener(this);
		btnCls.addActionListener(this);
		
		setTitle("간단 카운터");
		setSize(400, 150);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingCounter();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == btnInc)
			tf.setText(Integer.toString(Integer.parseInt(tf.getText().trim()) + 1));
		else if (e.getSource() == btnDec)
			tf.setText(Integer.toString(Integer.parseInt(tf.getText().trim()) - 1));
		else if (e.getSource() == btnCls)
			tf.setText("0");
	}

}
