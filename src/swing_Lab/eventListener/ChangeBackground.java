package swing_Lab.eventListener;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame6 extends JFrame {
	
	
	private JButton button1;
	private JButton button2;
	
	private JPanel panel;
	MyListener listener = new MyListener();

	
	public MyFrame6() {
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("�̺�Ʈ ����");
		
		panel = new JPanel();
		button1 = new JButton("�����");
		button1.addActionListener(listener);
		panel.add(button1);
		
		button2 = new JButton("��ũ��");
		button2.addActionListener(listener);
		panel.add(button2);
		
		this.add(panel);
		this.setVisible(true);
		
	}
	
	
	private class MyListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			System.out.println(e.getActionCommand());
			System.out.println(e.getID());
			System.out.println(e.getSource().toString());
			
			if(e.getSource() == button1) {			// �̺�Ʈ �ҽ� ã��
				panel.setBackground(Color.yellow);
			} else if(e.getSource() == button2) {	// �̺�Ʈ �ҽ� ã�� 
				panel.setBackground(Color.pink);
			}
		}
	}
}



public class ChangeBackground {
	public static void main(String[] args) {
		MyFrame6 f = new MyFrame6();
	}
}
