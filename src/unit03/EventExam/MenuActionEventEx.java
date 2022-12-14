package unit03.EventExam;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MenuActionEventEx extends JFrame implements ActionListener{

	JMenuBar mb = new JMenuBar();
	JMenu m_Screen = new JMenu("Screen");
	JMenuItem[] screenItem = new JMenuItem[4];
	String[] screenNames = {"불러오기", "숨기기", "다시보여주기", "끝내기"};
	
	JLabel imgLabel = new JLabel();
	
	public MenuActionEventEx() {
		
		this.setLayout(new BorderLayout());
		this.add(imgLabel, BorderLayout.CENTER);
		this.setJMenuBar(mb);
		
		mb.add(m_Screen);
		
		for (int i = 0; i < 4; ++i) {
			screenItem[i] = new JMenuItem(screenNames[i]);
			m_Screen.add(screenItem[i]);
			screenItem[i].addActionListener(this);
		}
		
		setTitle("Menu 만들기");
		setSize(250, 250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MenuActionEventEx();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "불러오기":
			imgLabel.setIcon(new ImageIcon("img/img.jpg"));
			break;
		case "숨기기":
			imgLabel.setVisible(false);
			break;
		case "다시보여주기":
			imgLabel.setVisible(true);
			break;
		case "끝내기":
			System.exit(0);
			break;
		}
	}

}
