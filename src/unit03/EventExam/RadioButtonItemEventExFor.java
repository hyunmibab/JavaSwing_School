package unit03.EventExam;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class RadioButtonItemEventExFor extends JFrame implements ItemListener{

	JTextField src = new JTextField(9);
	JTextField des = new JTextField(9);
	
	String[] str = {"Decimal", "Binary", "Octal", "Hex"};
	JRadioButton[] rbtn = new JRadioButton[4];
	
	public RadioButtonItemEventExFor() {
		
		JPanel p = new JPanel();
		this.add(p);
		
		p.add(src);
		p.add(new JLabel("→", JLabel.CENTER));
		p.add(des);

		ButtonGroup bg = new ButtonGroup();
		for (int i = 0; i < 4; ++i) {
			rbtn[i] = new JRadioButton(str[i]);
			bg.add(rbtn[i]);
			p.add(rbtn[i]);
			rbtn[i].addItemListener(this);
		}
		
		setTitle("진수변환예제 for");
		setSize(300, 150);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new RadioButtonItemEventExFor();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			if (e.getItem() == rbtn[0])
				des.setText(src.getText());
			if (e.getItem() == rbtn[1])
				des.setText(Integer.toBinaryString(Integer.parseInt(src.getText())));
			if (e.getItem() == rbtn[2])
				des.setText(Integer.toOctalString(Integer.parseInt(src.getText())));
			if (e.getItem() == rbtn[3])
				des.setText(Integer.toHexString(Integer.parseInt(src.getText())).toUpperCase());
		}
	}

}
