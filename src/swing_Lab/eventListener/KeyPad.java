package swing_Lab.eventListener;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KeyPad extends JFrame implements ActionListener {
	
	private JTextField txt;
	private JPanel p;
	
	
	public KeyPad() {
		txt = new JTextField(20);							// input tag
		add(txt, BorderLayout.NORTH);						// top, 프레임 상단
		
		p = new JPanel();
		p.setLayout(new GridLayout(3,3));
		
		add(p, BorderLayout.CENTER);						// center, 프레임 중앙
		
		// 그리드가 3x3 사이즈라서 알아서 줄바꿈
		for(int i = 1; i<=9; i++) {
			JButton btn = new JButton("" + i);
			btn.addActionListener(this);
			btn.setPreferredSize(new Dimension(100,100));	// 버튼사이즈 
			p.add(btn);
		}
		
		pack();												// 그리드 적용
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		txt.setText(txt.getText() + actionCommand);		//기존에 쓰여져있던것 + 방금클릭된것
	}	
	
	public static void main(String[] args) {
		
		new KeyPad();
	}

















}
