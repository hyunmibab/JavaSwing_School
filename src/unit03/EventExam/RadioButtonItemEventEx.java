package unit03.EventExam;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class RadioButtonItemEventEx extends JFrame implements ItemListener{

	JTextField src = new JTextField(9);
	JTextField des = new JTextField(9);
	JRadioButton decimal = new JRadioButton("Decimal");
	JRadioButton binary = new JRadioButton("Binary");
	JRadioButton octal = new JRadioButton("Octal");
	JRadioButton hex = new JRadioButton("Hex");
	
	public RadioButtonItemEventEx() {
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(decimal);
		bg.add(binary);
		bg.add(octal);
		bg.add(hex);
		
		JPanel p = new JPanel();
		this.add(p);
		
		p.add(src);
		p.add(new JLabel("→", JLabel.CENTER));
		p.add(des);
		p.add(decimal);
		p.add(binary);
		p.add(octal);
		p.add(hex);
		
		decimal.addItemListener(this);
		binary.addItemListener(this);
		octal.addItemListener(this);
		hex.addItemListener(this);
		
		setTitle("진수변환예제");
		setSize(300, 150);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new RadioButtonItemEventEx();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			if (e.getItem() == decimal)
				des.setText(src.getText());
			if (e.getItem() == binary)
				des.setText(Integer.toBinaryString(Integer.parseInt(src.getText())));
			if (e.getItem() == octal)
				des.setText(Integer.toOctalString(Integer.parseInt(src.getText())));
			if (e.getItem() == hex)
				des.setText(Integer.toHexString(Integer.parseInt(src.getText())).toUpperCase());
		}
	}

}
